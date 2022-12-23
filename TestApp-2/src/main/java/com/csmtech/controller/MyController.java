package com.csmtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Test;
import com.csmtech.repository.TestRepository;

@Controller
public class MyController {
	@Autowired
	private TestRepository testRepository;

	@RequestMapping("/test")
	private String saveData() {
		return "myPrac";
	}

	@GetMapping("/saveData")
	public String saveDa(@RequestParam("name") String name, @RequestParam("mobileno") String mobileNo, Model model) {

		Test test = new Test();
//		System.out.println(test.getMobileno());
		//System.out.println("user" + mobileNo);
		test.setName(name);
		test.setMobileno(mobileNo);
		String data=name;
		System.out.println("form"+name);
		System.out.println("data"+name);
		
		
		String testList= testRepository.getTestMobileno(mobileNo);
		
    System.out.println("database"+testList);
		
		    if(testList!=null) {
			if (testList.equals(mobileNo)) {
				return "invalid";
			}
		    }
          testRepository.save(test);
          model.addAttribute("test1",testRepository.getName(data));

		return "showPage";

}
}