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
            final var id = i + 1;
            final var line = lines.get(i);
            final var name = line;
            final var task = new Task(id, name);
            tasks.add(task);
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