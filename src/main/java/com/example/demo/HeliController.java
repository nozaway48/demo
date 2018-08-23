package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeliController {
	
	@RequestMapping("/test")
	public String index() {
		return "Hello Spring-Boot World!!";
	}


}
