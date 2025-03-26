package com.practice.springboot.StudyGrind.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(new Todo(1, "anushree", "Learn Springboot",
                        LocalDate.now().plusMonths(1), false));
        todoList.add(new Todo(1, "anushree", "Learn Hibernate",
                LocalDate.now().plusMonths(2), false));
        todoList.add(new Todo(1, "anushree", "Learn Microservices", LocalDate.now().plusMonths(3), false));
    }

    public List<Todo> get_todos(){
        return todoList;
    }

}
