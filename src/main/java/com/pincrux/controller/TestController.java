package com.pincrux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class TestController{
	@RequestMapping("/index")
	public String welcome() {
		System.out.println("cccccccccccccccccccccccc");
		return "index"; 
	}

}
