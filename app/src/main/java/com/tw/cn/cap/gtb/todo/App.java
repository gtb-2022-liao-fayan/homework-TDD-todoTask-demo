package com.tw.cn.cap.gtb.todo;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

    }

    public List<String> run() {
        try {
            final List<String> result = new ArrayList<>();
            result.add("# To be Done");
            result.addAll(Files.readAllLines(Constants.TASK_FILE_PATH));
            return result;
        } catch (IOException e) {
            throw new TodoCannotReadFileException();
        }
    }
}
