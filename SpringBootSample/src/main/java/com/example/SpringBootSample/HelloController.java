package com.example.SpringBootSample;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloController{

	@RequestMapping("/Hello")
	public String home() {
		return "Hello Chutiya!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloController.class, args);
	}

}