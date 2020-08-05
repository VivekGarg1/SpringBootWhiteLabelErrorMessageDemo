package com.example.contoller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController /* implements ErrorController */{
	
	private static final String PATH="/error";
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String hello() {
		return "Hello World!!!";
	}
	
	/*
	 * @GetMapping(PATH) public String defaultErrorMessage() { return
	 * "Requested Resource not found!!!"; }
	 * 
	 * @Override public String getErrorPath() { return PATH; }
	 */
}
