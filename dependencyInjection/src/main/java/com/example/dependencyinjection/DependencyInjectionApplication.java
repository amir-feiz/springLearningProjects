package com.example.dependencyinjection;

import com.example.dependencyinjection.scope.Prototype;
import com.example.dependencyinjection.scope.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DependencyInjectionApplication.class, args);
//		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());
//		////////////////////////////////////////////////////////////////////////////////////////
//		ValueTest valueTest = context.getBean(ValueTest.class);
//		System.out.println(valueTest.getValueTest());
//		System.exit(0);
		////////////////////////////////////////////////////////////////////////////////////////
		Singleton singleton1 = context.getBean(Singleton.class);
		System.out.println(singleton1.hashCode());

		Singleton singleton2 = context.getBean(Singleton.class);
		System.out.println(singleton2.hashCode());

		Singleton singleton3 = context.getBean(Singleton.class);
		System.out.println(singleton3.hashCode());

		Prototype prototype1 = context.getBean(Prototype.class);
		System.out.println(prototype1.hashCode());

		Prototype prototype2 = context.getBean(Prototype.class);
		System.out.println(prototype2.hashCode());

		Prototype prototype3 = context.getBean(Prototype.class);
		System.out.println(prototype3.hashCode());
	}

}
