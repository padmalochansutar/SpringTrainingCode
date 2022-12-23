package com.csmtech.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
	
	@RequestMapping("/test")
	public String test() {
		System.out.println("working...");
		return "working....";
	}

}

