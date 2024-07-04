package com.coderelated.springawsdeployement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringawsdeployementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringawsdeployementApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String helloworld() {
		return "hello world!";
	}

}
