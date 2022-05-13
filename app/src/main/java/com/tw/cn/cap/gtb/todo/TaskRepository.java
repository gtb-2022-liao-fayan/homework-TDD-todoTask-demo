package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public TaskRepository() {
    }

    List<Task> loadTasks() {
        final List<String> lines = loadTaskLines();
        final List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            tasks.add(TaskFactory.createTask(i + 1, lines.get(i)));
        }
        return tasks;
    }

    List<String> loadTaskLines() {
        try {
            return Files.readAllLines(Constants.TASK_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}