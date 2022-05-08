package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App {

    public static final String USERS_HOME_PATH = System.getProperty("user.home");
    public static final String TODO_CONFIG_ROOT = ".todo";
    public static final String TASKS_FILENAME = "tasks";
    public static final Path TASK_FILE_PATH = Path.of(USERS_HOME_PATH, TODO_CONFIG_ROOT, TASKS_FILENAME);

    public static void main(String[] args) {

    }

    public List<String> run() {
        try {
            return Files.readAllLines(TASK_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}
