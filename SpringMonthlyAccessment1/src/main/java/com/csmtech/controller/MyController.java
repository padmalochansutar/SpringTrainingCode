package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

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
import com.csmtech.model.Fees;

import com.csmtech.model.Registration;
import com.csmtech.repository.BranchRepository;
import com.csmtech.repository.CollegeRepository;
import com.csmtech.repository.FeesRepository;
import com.csmtech.repository.RegistrationRepository;

@Controller
public class MyController {
	@Autowired
	private CollegeRepository collegeRepository;
	@Autowired
	private BranchRepository branchRepository;
	@Autowired
	private FeesRepository feesRepository;
	@Autowired
	private RegistrationRepository registrationRepository;
	@GetMapping("/test")
	public String test(Model model) {
		model.addAttribute("collegeList",collegeRepository.findAll());
		return "CollegeRegistrationForm";
	}

	
	String data = "";

	@GetMapping("/getByCollegeId")
	public void getCollegeId(@RequestParam("cId") Integer cId, HttpServletResponse resp) throws IOException {
		PrintWriter pw = resp.getWriter();
		List<Branch> branch = branchRepository.findByCId(cId);
		System.out.println("branch is:"+branch);

		data += "<option value='" + 0 + "'>" + "--SELECT--" + "</option>";

		for (Branch bh : branch) {
			data += "<option value='" + bh.getBranchId() + "'>" + bh.getBranchName() + "</option>";

		}
		pw.print(data);
		data = null;
	}
	@GetMapping("/getByBranchId")
	public void getBranchId(@RequestParam("bId") Integer bId, HttpServletResponse resp) throws IOException {
		System.out.println("the branch id:"+bId);
		PrintWriter pw = resp.getWriter();
		Long fees = feesRepository.findByBId(bId);
		
			pw.print(fees);
		System.out.println("the fees Is:"+fees);
		
		
	}
	@PostMapping("/saveData")
	public String saveAllData(@RequestParam("cName") College cId, @RequestParam("bName") Branch bId,
			@RequestParam("applicantName") String name, @RequestParam("email") String email,
			@RequestParam("mobileNo") Long number, @RequestParam("dob") String date,
			@RequestParam("gender") String gender, @RequestParam("idProof") MultipartFile img) throws Exception {
		LocalDate today = LocalDate.now();
		System.out.println("today date is :"+today);
		LocalDate birthday = LocalDate.parse(date);
		System.out.println("th form date is:"+birthday);
		
		Period period = Period.between( birthday,today);
		int years = period.getYears();
		
		System.out.println("the age is:"+years);
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
		Registration rg = new Registration();
		rg.setCollege(cId);
		rg.setBranch(bId);
		
		rg.setApplicantName(name);
		rg.setEmail(email);
		rg.setMobileNo(number);
		rg.setAge(years);
		rg.setIdProof("E:/FileUpload/" + img.getOriginalFilename());
		rg.setIsDelete("No");
		if(rg.getAge()>=15) {
			registrationRepository.save(rg);
		}
		else {
			throw new Exception("age must be greater than 15");
		}

		
		return "redirect:./test";

	}
	@GetMapping("/allData")
	public String allData(Model model) {
		List<Registration> findAll = registrationRepository.findDataAll();
		System.out.println("the data is:"+findAll);
		model.addAttribute("allBookingList",findAll);
		return "viewPage";
		
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("registrationId") Integer rId) {
		System.out.println("..........>"+rId);
	//	registrationRepository.deleteDataById(rId);
		System.out.println("the reg id:"+rId);
		
		return "redirect:./allData";
		
	}
}
