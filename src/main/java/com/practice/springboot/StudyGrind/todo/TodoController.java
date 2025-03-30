package com.practice.springboot.StudyGrind.todo;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        model.put("todo_list", todoService.get_todos());
        return "list_todos"; //list_todos.jsp
    }

    @RequestMapping(value="/add_todo", method = RequestMethod.GET)
    public String newToDo(ModelMap model){
        Todo t = new Todo(0, model.get("user_name").toString(),"", LocalDate.now().plusMonths(1), false);
        model.put("todo", t);
        return "new_todo";
    }

    @RequestMapping(value="/add_todo", method = RequestMethod.POST)
    public String addNewToDo(ModelMap model, @Valid Todo todo, BindingResult result){
        if(result.hasErrors()){
            return "new_todo";
        }
        logger.info("Username: {}",todo.getUsername());
        todoService.addToDo(todo.getUsername(), todo.getDescription());
        return "redirect:/list_todos";
    }




}
