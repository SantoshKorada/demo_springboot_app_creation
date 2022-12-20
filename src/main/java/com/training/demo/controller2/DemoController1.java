package com.training.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo1")
public class DemoController1 {
	
	@GetMapping("message")
	public String message()
	{
		return "Welcome to Spring Boot in Demo Controller 2!...";
	}
	
	
}
