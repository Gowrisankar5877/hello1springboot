package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1Controller {

	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}

}


