package com.example.dependencyinjection.config;

import com.example.dependencyinjection.controller.PizzaController;
import com.example.dependencyinjection.service.NonVegPizza;
import com.example.dependencyinjection.service.Pizza;
import com.example.dependencyinjection.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }
    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init"  , destroyMethod = "destroy")
    public PizzaController pizzaController(){
//        return new PizzaController(vegPizza());
        return new PizzaController(nonVegPizza());
    }

}

