package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class AppTest {
    @Test
    void should_list_existing_tasks() {
        final var result = new App().run();
        Assertions.assertEquals(List.of(
                "# To be Done",
                "1 Task 01",
                "2 Task 02"
        ), result);
    }
}
