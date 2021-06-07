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

@GetMapping("/education")
	public String education() {
		String name = "<h1 style='text-align:center'> I am pursuing my B.Tech from VIT Pune in Computer Engineering </h1>";
		return name;
	}

@GetMapping("/age")
	public String education() {
		String name = "<h1 style='text-align:center'> I am 21 year old </h1>";
		return name;
	}
	
}
