package org.security.demo.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping(value = { "/login", "/" })
	public String getUser() {
		return "Successfully Logged In";
	}

	@GetMapping(value = { "/dashboard" })
	public String getDashboard() {
		return "Welcome to Dashboard";
	}

}