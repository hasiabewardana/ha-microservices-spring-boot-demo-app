package com.example.ha_microservices_spring_boot_demo_app.junit_testing;

public class MyMath {
    public int calculateSum(int[] numbers){
        int sum = 0;

        for(int number: numbers){
            sum += number;
        }

        return sum;
    }
}
