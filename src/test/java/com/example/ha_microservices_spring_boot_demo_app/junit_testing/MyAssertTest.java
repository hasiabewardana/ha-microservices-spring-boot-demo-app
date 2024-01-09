package com.example.ha_microservices_spring_boot_demo_app.junit_testing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void testAsserts() {
        boolean test1 = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");

        assertTrue(true, String.valueOf(test1));
        assertFalse(false, String.valueOf(test2));
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});
        assertEquals(3, todos.size());
    }
}
