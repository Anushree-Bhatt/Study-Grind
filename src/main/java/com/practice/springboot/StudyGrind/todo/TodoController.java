package com.practice.springboot.StudyGrind.todo;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@SessionAttributes("user_name")
public class TodoController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list_todos")
    public String listOfTodos(ModelMap model){
        String username = getLoggedInUsername();
        model.put("todo_list", todoService.get_todos(username));
        return "list_todos"; //list_todos.jsp
    }

    @RequestMapping(value="/add_todo", method = RequestMethod.GET)
    public String showNewToDo(ModelMap model){
        String username = getLoggedInUsername();
        Todo t = new Todo(0, username,"", LocalDate.now(), false);
        model.put("todo", t);
        return "new_todo";
    }

    @RequestMapping(value="/add_todo", method = RequestMethod.POST)
    public String addNewToDo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "new_todo";
        }
        String username = getLoggedInUsername();
        todoService.addToDo(username, todo);
        return "redirect:/list_todos";
    }

    @RequestMapping(value="/delete_todo", method = RequestMethod.GET)
    public String deleteToDo(@RequestParam int id){
        todoService.deleteToDo(id);
        return "redirect:/list_todos";
    }

    @RequestMapping(value="/update_todo", method = RequestMethod.GET)
    public String showUpdateToDo(@RequestParam int id, ModelMap model){
        Todo todo = todoService.getTodo(id);
        logger.info("To do Obj: {}",todo.toString());
        model.put("todo", todo);
        return "new_todo";
    }

    @RequestMapping(value="/update_todo", method = RequestMethod.POST)
    public String updateToDo(@RequestParam int id, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "new_todo";
        }
        todoService.updateToDo(id, todo);
        return "redirect:/list_todos";
    }

    private String getLoggedInUsername(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }




}
