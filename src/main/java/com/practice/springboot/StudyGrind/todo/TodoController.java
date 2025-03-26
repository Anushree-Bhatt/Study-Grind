package com.practice.springboot.StudyGrind.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todo")
    public String listOfTodos(ModelMap model){
        model.put("todo", todoService.get_todos());
        return "todo"; //todo.jsp
    }
}
