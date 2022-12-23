package com.csmtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.service.CountriesService;

@Controller
public class MyController {
	
	@Autowired
	private CountriesService countriesService;
	
	
    @RequestMapping(path="/test")
	public String test(Model model) {
    	model.addAttribute("countryList",countriesService.getAllCountries());
		return "myPage";
	}
}
