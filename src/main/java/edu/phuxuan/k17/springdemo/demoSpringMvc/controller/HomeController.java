package edu.phuxuan.k17.springdemo.demoSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/helloword")
	public String helloword() {
		return "helloword";
	}
}
