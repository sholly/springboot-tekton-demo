package org.unixnerd.springboottektondemo.model;

public class Todo {

    private static long idCount = 0;

    private Long id;
    private String name;
    private String description;
    private Boolean finished;

    public Todo(String name, String description, Boolean finished) {
        idCount += 1;
        this.id = idCount;
        this.name = name;
        this.description = description;
        this.finished = finished;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getFinished() {
        return finished;
    }
}
