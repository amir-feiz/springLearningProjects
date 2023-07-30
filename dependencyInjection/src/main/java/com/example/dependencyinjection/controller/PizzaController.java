package com.example.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import com.example.dependencyinjection.service.Pizza;

public class PizzaController {

    private Pizza pizza;

//    @Autowired
//    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("comes to init");
    }
    public void destroy(){
        System.out.println("comes to destroy");
    }
}
