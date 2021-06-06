package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

	
	@GetMapping("/name")
	public String name() {
		String name = "<h1 style='text-align:center'> My name is Suraj Rathod </h1>";
		return name;
	}
	
	@GetMapping("/address")
	public String address() {
		String name = "<h1 style='text-align:center'> My village is located in Nanded District of Maharastra State </h1>";
		return name;
	}
	
}
