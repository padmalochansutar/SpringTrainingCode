package com.csmtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.model.States;
import com.csmtech.service.StatesService;

@Controller
public class FrontController {
	@Autowired
	private StatesService statesService;
	
	@RequestMapping(path="/test")
	public String test(Model model) {
		model.addAttribute("stateList",statesService.getAlldata() );
		return "myPrac";
	}

}
