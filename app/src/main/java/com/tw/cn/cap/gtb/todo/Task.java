package com.tw.cn.cap.gtb.todo;

public class Task {
    private final int id;
    private final String name;
    private final boolean completed;

    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    String format() {
        return String.format("%d %s", getId(), getName());
    }

    public boolean isCompleted() {
        return this.completed;
    }
}
