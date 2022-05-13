package com.tw.cn.cap.gtb.todo;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final TaskRepository taskRepository = new TaskRepository();

    public static void main(String[] args) {

    }

    public List<String> run() {
        final List<Task> tasks = taskRepository.loadTasks();
        final List<String> result = new ArrayList<>();
        result.add("# To be Done");
        tasks.stream().filter(item -> !item.isCompleted()).map(Task::format).forEach(result::add);
        result.add("# Completed");
        tasks.stream().filter(Task::isCompleted).map(Task::format).forEach(result::add);
        return result;
    }


}
