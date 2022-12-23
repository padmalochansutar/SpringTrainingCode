package com.csmtech.controller;



import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csmtech.helper.ExcelHelper;
import com.csmtech.model.Tutorial;
import com.csmtech.repository.TutorialRepository;
import com.csmtech.service.ExcelService;

@Controller
public class MyController {
	
	@Autowired
	private TutorialRepository repository;
	@RequestMapping
	public String Index() {
		return "register";
		
	}
	
	@GetMapping("/download/tutorial.xlsx")
  public void downloadExcelFile(HttpServletResponse response) throws IOException {
		
		response.setContentType("application/octet-stream");
		response.setHeader("content-Disposition", "attachment;filename=Tutorial.xlsx");
		
		ByteArrayInputStream inputStream=ExcelHelper.tutorialsToExcel(createTestData());
		System.out.println("the input stream is:"+inputStream);
		IOUtils.copy(inputStream, response.getOutputStream());
		System.out.println("the outputStrem is:"+response.getOutputStream());
	  
  }
	
	private List<Tutorial> createTestData(){
		//creating list of tutorials data for testing
//		List<Tutorial> tutorials=new ArrayList<Tutorial>();
//		
//		tutorials.add(new Tutorial(1,"c","dennis",false));
//		tutorials.add(new Tutorial(2,"c++","dennis",true));
//		tutorials.add(new Tutorial(3,"java","james",true));
		//repository.saveAll(tutorials);
		return repository.findAll();
		
	}
	
	
}
