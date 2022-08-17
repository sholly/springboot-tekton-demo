package org.unixnerd.springboottektondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unixnerd.springboottektondemo.model.Todo;
import org.unixnerd.springboottektondemo.repository.TodoRepository;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todoRepository.getAll();
    }
}
