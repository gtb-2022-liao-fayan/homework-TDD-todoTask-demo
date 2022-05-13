package com.tw.cn.cap.gtb.todo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TaskFactoryTest {
    @Test
    void should_parse_completed_property_for_task() {
        final var isCompleted = TaskFactory.createTask(1, "+ foobar").isCompleted();
        assertFalse(isCompleted);
    }

    @Test
    void should_support_name_with_multiple_white_spaces() {
        final var task = TaskFactory.createTask(1, "+        foo     bar").getName();
        assertEquals("       foo     bar", task);
    }
}