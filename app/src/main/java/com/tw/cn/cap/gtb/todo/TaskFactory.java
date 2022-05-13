package com.tw.cn.cap.gtb.todo;

public class TaskFactory {
    private TaskFactory(){

    }
    public static Task createTask(int id, String line) {
        final var filed = line.split(" ", 2);
        final var name = filed[1];
        boolean completed = filed[0].equals("x");
        return new Task(id, name, completed);
    }
}