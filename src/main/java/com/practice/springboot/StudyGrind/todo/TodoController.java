package com.practice.springboot.StudyGrind.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user_name")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list_todos")
    public String listOfTodos(ModelMap model){
        model.put("todo_list", todoService.get_todos());
        return "list_todos"; //list_todos.jsp
    }
}
