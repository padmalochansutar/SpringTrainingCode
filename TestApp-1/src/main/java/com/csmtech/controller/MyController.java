package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Cities;
import com.csmtech.model.Countries;
import com.csmtech.model.States;
import com.csmtech.repository.CitiesRepository;
import com.csmtech.repository.CountriesRepository;
import com.csmtech.repository.StatesRepository;
@Controller
public class MyController {
	@Autowired
	private CountriesRepository countriesRepository;
	
	@Autowired
	private StatesRepository statesRepository; 
	
	@Autowired
	private CitiesRepository citiesRepository;

	@GetMapping("/test")
	public String test(Model model, HttpServletResponse resp) {
		
		model.addAttribute("countryList",countriesRepository.findAll());
		
	
		return "Ajax";
	}
	@GetMapping("/getStatesByCountryId")
	public void getStatesByCountryId(Integer countryId, HttpServletResponse resp) {
		PrintWriter pw=null;
		try {
			 pw=resp.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<States> stateList=statesRepository.findStatesByCountryId(countryId);
		System.out.println(stateList);
		String t="";
		for(States st:stateList) {
			
			t+="<option value='"+st.getStateId()+"'>"+st.getName()+"</option>";
		}
		pw.print(t);
	}
	
@GetMapping("/getCitiesByStateId")
public void getCitiesByStateId(Integer stateId, HttpServletResponse resp) {
	PrintWriter pw=null;
	try {
		 pw=resp.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	List<Cities> citiesList=citiesRepository.findCitiesByStateId(stateId);
	System.out.println(citiesList);
	String t="";
	for(Cities ct:citiesList) {
		
		t+="<option value='"+ct.getStateId()+"'>"+ct.getName()+"</option>";
	}
	pw.print(t);
}
}

