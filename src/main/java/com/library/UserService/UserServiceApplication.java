package com.library.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserServiceApplication {

	// new changes
	@GetMapping("/")
	public String welcome(){
		return "hello";
	}


	// change done from remove repo
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
