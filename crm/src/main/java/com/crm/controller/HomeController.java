package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println(1111);
		return "home";
	}
	
	@RequestMapping("/index")
	public String index() {
		System.out.println(11122221);
		return "index";
	}
}
