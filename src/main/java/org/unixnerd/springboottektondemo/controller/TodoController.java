package org.unixnerd.springboottektondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unixnerd.springboottektondemo.model.Todo;
import org.unixnerd.springboottektondemo.repository.TodoRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getTodos(){
        return todoRepository.getAll();
    }
    
    @GetMapping("/todos2")
    public List<Todo> getTodos2() {
        return todoRepository.getAll2();
    }

    @GetMapping("todos3")
    public String getTodos3() {
        return "no";
    }

    @GetMapping("/todos4")
    public List<Todo> getTodos4() {
        List<Todo> results = new ArrayList<>();
        results.add(new Todo("foo", "bar", false));
        return results;
    }
}
