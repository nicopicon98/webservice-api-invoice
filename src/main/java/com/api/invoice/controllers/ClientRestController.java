package com.api.invoice.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientRestController {
	
	@GetMapping("/clients")
	public String findAll() {
		return "All clients all";
	}
}
