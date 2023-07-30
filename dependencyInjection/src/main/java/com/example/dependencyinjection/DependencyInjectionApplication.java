package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.PizzaController;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DependencyInjectionApplication.class, args);
		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
		System.exit(0);
	}

}
