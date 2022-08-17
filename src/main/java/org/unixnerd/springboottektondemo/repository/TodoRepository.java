package org.unixnerd.springboottektondemo.repository;

import org.springframework.stereotype.Service;
import org.unixnerd.springboottektondemo.model.Todo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoRepository {

    public List<Todo> getAll() {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("one", "this is one", false));
        todos.add(new Todo("two", "this is two", false));
        todos.add(new Todo("three", "this is three", false));
        return todos;
    }
}
