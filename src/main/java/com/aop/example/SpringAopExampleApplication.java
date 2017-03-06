package com.aop.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopExampleApplication.class, args);
	}

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(AspectConfig.class);
//		ctx.refresh();
//		CalculatorService userService = ctx.getBean(CalculatorService.class);
//		userService.multiply(2, 3);
//	}
}
