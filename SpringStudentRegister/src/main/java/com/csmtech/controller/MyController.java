package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.Course;
import com.csmtech.model.Student;
import com.csmtech.repository.CourseRepository;
import com.csmtech.repository.DepartmentRepository;
import com.csmtech.repository.StudentRepository;

@Controller
public class MyController {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("departmentList",departmentRepository.findAll());
		return "index";
	}
	String data="";
	
	@GetMapping("/getdepartmentId")
    public void deptCourse(@RequestParam("deptCourse") Integer deptId, HttpServletResponse resp) throws IOException {
		PrintWriter pw=resp.getWriter();
		List<Course>courseList=courseRepository.findCourseBydeptId(deptId);
		System.out.println("the course List is:"+courseList);
		data+="<option value='"+0+"'>"+"--SELECT--"+"</option>";
		for (Course course : courseList) {
			
			data+="<option value='"+course.getCourseId()+"'>"+course.getCourseName()+"</option>";
		}
		
		System.out.println(courseList);
		 pw.print(data);
    }
	@PostMapping("/saveData")
	public String saveData(@ModelAttribute Student student ,Model model) {
		//,@RequestParam("pic") MultipartFile userPic
//		System.out.println("the course id:"+student.getPic());
//		System.out.println("the first all student is:"+student);
//		File file=new File("E:/PicFile/" +userPic.getOriginalFilename());
//		BufferedOutputStream bf=null;
//		try {
//			byte[] bytes = userPic.getBytes();
//			bf=new BufferedOutputStream(new FileOutputStream(file));
//			bf.write(bytes);
//			bf.close();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		student.setPic("E:/PicFile/" +userPic.getOriginalFilename());
		try {
		Student  findById = studentRepository.findByAddhar(student.getAddhar());
		
		
		if(student.getAddhar().equals(findById.getAddhar())) {
			model.addAttribute("data","already data exist give new addhar number");
			return "index";
		}
		}catch (Exception e) {
		}
		
		System.out.println("the all student is:"+student);
		studentRepository.save(student);
		
		
			
	
		return null;
	}
	
	@GetMapping("/getAddharValidate")
    public void getAddharNo(@RequestParam("addharno") Long addhar, HttpServletResponse resp) throws IOException {
		PrintWriter pw = resp.getWriter();
    	Student student=studentRepository.findByAddhar(addhar);
    	if(student!=null) {
    		pw.println("This Addhar number is already exit !please try with another Addharnumber");
    	}
    }
    
}
