package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SpringController {
	
	@RequestMapping("/hello")
	public String sayhello() {
		return "First Sample...!!!!!Welcome Vignesh!!!!!";
	}

}
