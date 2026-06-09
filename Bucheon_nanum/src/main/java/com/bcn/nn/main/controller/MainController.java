package com.bcn.nn.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index"; 
    }
    
	@GetMapping("/greeting")
	public String registerPage() {
		return "greeting";
	}
}