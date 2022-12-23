package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.Student;
import com.csmtech.service.StudentService;
@RequestMapping("/student")
@Controller
public class MyController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/loginPage")
	public String page() {
		return "loginPage";
	}
	
	
	@GetMapping("/getData")
	public String getAllData(Model model ) {
		model.addAttribute("studentList",studentService.getAllData());
		return "dataTable";
		
	}
	@PostMapping("/saveData")
	public String  saveData(@RequestParam("name") String name,
			@RequestParam("fees") Double fees,
			@RequestParam("date") String date,
			@RequestParam("file") MultipartFile file) {
		File f=new File("E:/FileUpload/"+file.getOriginalFilename());
		BufferedOutputStream bf=null;
		try {
			byte[] bytes=file.getBytes();
			bf=new BufferedOutputStream(new FileOutputStream(f));
			bf.write(bytes);
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Student stu=new Student();
		stu.setName(name);
		stu.setFees(fees);
		try {
			stu.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		stu.setFile("E:/FileUpload/"+file.getOriginalFilename());
		
		System.out.println(stu);
		studentService.saveData(stu);
	
		return "redirect:./getData";
	}

}
