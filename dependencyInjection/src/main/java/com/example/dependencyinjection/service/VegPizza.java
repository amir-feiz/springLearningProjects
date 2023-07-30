package com.example.dependencyinjection.service;

import org.springframework.stereotype.Component;

//@Component
public class VegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "veg Pizza";
    }
}
