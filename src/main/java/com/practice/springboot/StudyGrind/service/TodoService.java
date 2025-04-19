package com.practice.springboot.StudyGrind.service;

import com.practice.springboot.StudyGrind.repository.TodoRepository;
import com.practice.springboot.StudyGrind.todo.Todo;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    Logger logger = LoggerFactory.getLogger(getClass());

    public List<Todo> get_todos(String username){
        return todoRepository.findAllByUsername(username);

    }

    public void addToDo(String userName, Todo todo) {
        todo.setUsername(userName);
        logger.info("***********************************************************");
        logger.info("{}",todo.getId());

        todoRepository.save(todo);

    }

    public void deleteToDo(int id) {
        todoRepository.deleteById(id);
    }

    public Todo getTodo(int id) {
        return todoRepository.findById(id).get();
    }

    public void updateToDo(int id, Todo todo) {
        Todo oldTodo = getTodo(id);
        oldTodo.setDescription(todo.getDescription());
        oldTodo.setTargetDate(todo.getTargetDate());
        todoRepository.save(oldTodo);
    }
}
