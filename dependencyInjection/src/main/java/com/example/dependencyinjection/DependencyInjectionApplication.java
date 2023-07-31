package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.PizzaController;
import com.example.dependencyinjection.valuePackage.ValueTest;
import lombok.val;
import org.springframework.boot.ExitCodeEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DependencyInjectionApplication.class, args);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());
		ValueTest valueTest = context.getBean(ValueTest.class);
		System.out.println(valueTest.getValueTest());
		System.exit(0);
	}

}
