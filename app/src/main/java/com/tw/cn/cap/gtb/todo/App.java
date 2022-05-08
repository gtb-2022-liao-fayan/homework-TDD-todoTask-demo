package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

    }

    public List<String> run() {
        final List<String> lines = loadTaskLines();
        final List<String> result = new ArrayList<>();
        result.add("# To be Done");
        result.addAll(lines);
        return result;
    }

    private List<String> loadTaskLines() {
        try {
            return Files.readAllLines(Constants.TASK_FILE_PATH);
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}
