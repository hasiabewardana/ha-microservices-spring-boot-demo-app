package com.example.hamicroservicesspringbootdemoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// Controller class
@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    // Controller method
    @RequestMapping("/currency")
    public CurrencyServiceConfiguration getAllCourses(){
        return currencyServiceConfiguration;
    }
}