package com.example.ha_microservices_spring_boot_demo_app.junit_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSum() {
        MyMath myMath = new MyMath();
        int[] numbers = {1, 2, 3};
        int result = myMath.calculateSum(numbers);
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }
}