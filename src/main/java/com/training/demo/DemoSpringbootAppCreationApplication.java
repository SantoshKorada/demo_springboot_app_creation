package com.training.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @EnableAutoConfiguration
//optional, if you want to restrict you can use
//@ComponentScan(basePackages = "com.training.demo")

public class DemoSpringbootAppCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootAppCreationApplication.class, args);
	}

}
