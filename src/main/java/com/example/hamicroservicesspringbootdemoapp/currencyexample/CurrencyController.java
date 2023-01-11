package com.example.hamicroservicesspringbootdemoapp.currencyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller class
@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    // Controller method
    @RequestMapping("/currency-configurations")
    public CurrencyServiceConfiguration getAllCourses(){
        return currencyServiceConfiguration;
    }
}