package com.mindtree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		return "Welcome";
	}
	
	@GetMapping("/user")
	public String user() {
		return "Welcome USER";
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return "Welcome ADMIN";
	}

}
