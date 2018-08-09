package com.test.playground.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@RequestMapping("/hiya/{name}")
	public String hiya(@PathVariable String name) {
		return "Hiya, " + name + "!";
	}

	@RequestMapping("/hello")
	public String hello(String name) {
		return "Hello, " + name + "!";
	}

}
