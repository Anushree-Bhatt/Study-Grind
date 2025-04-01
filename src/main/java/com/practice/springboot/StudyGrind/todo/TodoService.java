package com.practice.springboot.StudyGrind.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static int count = 0;
    private static List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(new Todo(++count, "anushree", "Learn Springboot",
                        LocalDate.now().plusMonths(1), false));
        todoList.add(new Todo(++count, "anushree", "Learn Hibernate",
                LocalDate.now().plusMonths(2), false));
        todoList.add(new Todo(++count, "anushree", "Learn Microservices", LocalDate.now().plusMonths(3), false));
    }

    public List<Todo> get_todos(){
        return todoList;
    }

    public void addToDo(String userName, Todo todo) {
        todoList.add(new Todo(++count, userName, todo.getDescription(), todo.getTargetDate(),false));
    }

    public void deleteToDo(int id) {
        todoList.removeIf(todo -> todo.getId() == id);
    }

    public Todo getTodo(int id) {
        return todoList.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateToDo(int id, Todo todo) {
        Todo oldTodo = getTodo(id);
        oldTodo.setDescription(todo.getDescription());
        oldTodo.setTargetDate(todo.getTargetDate());
    }
}
