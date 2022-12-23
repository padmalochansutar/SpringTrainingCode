package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;



import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.csmtech.model.Branch;
import com.csmtech.model.College;
import com.csmtech.model.Registation;
import com.csmtech.service.BranchService;
import com.csmtech.service.CollegeService;
import com.csmtech.service.RegistationService;

@Controller
public class MyController {

	@Autowired
	private CollegeService collegeService;
	@Autowired
	private BranchService branchService;
	@Autowired
	private RegistationService registationService;

	@GetMapping("/test")
	public String test(Model model) {

		model.addAttribute("collegeList", collegeService.findData());

	//	model.addAttribute("registationDetails", registationService.findData());

		return "index";
	}

	String data = "";

	@GetMapping("/getCollegeId")
	public void getCollegeId(@RequestParam("collegeBranch") Integer cId, HttpServletResponse resp) throws IOException {
		PrintWriter pw = resp.getWriter();
		List<Branch> branch = branchService.findBranchBycollegeId(cId);

		data += "<option value='" + 0 + "'>" + "--SELECT--" + "</option>";

		for (Branch bh : branch) {
			data += "<option value='" + bh.getBranchId() + "'>" + bh.getBranchName() + "</option>";

		}
		pw.print(data);
		data = null;
	}

	@PostMapping("/saveData")
	public String saveAllData(@RequestParam("collegeId") College cId, @RequestParam("branch") Branch bId,
			@RequestParam("applicantName") String name, @RequestParam("emailId") String email,
			@RequestParam("mobileNo") Long number, @RequestParam("dob") String date,
			@RequestParam("gender") String gender, @RequestParam("image") MultipartFile img) {
		System.out.println("the college is");
		File f = new File("E:/FileUpload/" + img.getOriginalFilename());
		BufferedOutputStream bf = null;
		try {
			byte[] bytes = img.getBytes();
			bf = new BufferedOutputStream(new FileOutputStream(f));
			bf.write(bytes);
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Registation rg = new Registation();
		rg.setBranch(bId);
		rg.setCollege(cId);
		rg.setApplicantName(name);
		rg.setEmailId(email);
		rg.setMobileNo(number);
		try {
			rg.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(date));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		rg.setGender(gender);
		rg.setImage("E:/FileUpload/" + img.getOriginalFilename());

		registationService.fetchData(rg);
		return "redirect:./getData";

	}

	@GetMapping("/getData")
	public String searchList(Model model) {
		model.addAttribute("collegeList", collegeService.findData());
		model.addAttribute("rList", registationService.findData());
		return "search";
	}

	String t = "";

	@GetMapping("/searchData")
	public String searchData(@RequestParam("courseData") Integer collId, HttpServletResponse resp, Model model)
			throws IOException {

		System.out.println(collId);
		System.out.println("the id is:" + collId);
		PrintWriter pw = resp.getWriter();

		List<Registation> list = registationService.searchData(collId);
		model.addAttribute("rList", list);
		model.addAttribute("collegeList", collegeService.findData());
		return "search";

//		for (Registation registation : list) {
//			 t+="<tr><td>"+registation.getApplicantName()+"</td><td>"+registation.getEmailId()+"</td><td>"+registation.getMobileNo()+"</td><td>"+registation.getImage()+"</td><td>"+registation.getCollege().getCollegeName()+"</td><td>"+registation.getBranch().getBranchName()+"</td><td>"+registation.getBranch().getFees()+"</td></tr>";
//		}
//String a="<table class='table table-striped' border='1' > <tbody>";
//		
//		String d="</tbody></table>";
//		System.out.println("the result of t is:"+t);
//		pw.print(a+t+d);

	}

}
