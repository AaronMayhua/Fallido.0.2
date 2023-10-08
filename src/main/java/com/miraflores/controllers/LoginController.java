package com.miraflores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping(value = "/inicio")
	public String login() { // aqui va con letra miniscula segun Spring
		return "Login";
	}
}
