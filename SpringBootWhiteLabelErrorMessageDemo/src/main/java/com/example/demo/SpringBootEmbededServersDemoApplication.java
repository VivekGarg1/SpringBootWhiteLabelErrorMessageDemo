package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.contoller"})
public class SpringBootEmbededServersDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmbededServersDemoApplication.class, args);
		
	}

}
