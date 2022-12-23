package com.csmtech.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.ApplicantDetails;

import com.csmtech.model.ConnectionSpeed;

import com.csmtech.model.ServiceProvider;
import com.csmtech.repository.ApplicantDetailsRepository;
import com.csmtech.repository.ConnectionSpeedRepository;
import com.csmtech.repository.ServiceProviderRepository;

@Controller
public class MyController {
	@Autowired
	private ConnectionSpeedRepository connectionRepo;
	@Autowired
	private ServiceProviderRepository serviceRepo;
	@Autowired
	private ApplicantDetailsRepository applicantRepo;
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("allApplicantList",applicantRepo.findAll());
		model.addAttribute("seviceList",serviceRepo.findAll());
		return "index";
		
	}
	String id="";
	@GetMapping("/getByproviderId")
	public void getByproviderId(@RequestParam("pId") Integer pId,HttpServletResponse resp) throws IOException {
		System.out.println("the branch id:"+pId);
		PrintWriter pw = resp.getWriter();
		 ConnectionSpeed findByBId = connectionRepo.findById(pId).get();
		System.out.println("the findByBid is:"+findByBId);
		 id=findByBId.getConnectionName();
			pw.print(id);
		System.out.println("the fees Is:"+findByBId);
		
		
	}
	
	@PostMapping("/saveData")
	public String saveAllData(@RequestParam("pName") ServiceProvider pId,
			@RequestParam("applicantName") String name, @RequestParam("email") String email,
			@RequestParam("mobileNo") String number, @RequestParam("dob") String date,
			@RequestParam("gender") String gender, @RequestParam("idProof") MultipartFile img) throws Exception {
		
		//System.out.println("....."+cname);
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
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		//Date parsedDate = formatter.parse("date");
		//Integer cId=Integer.parseInt(id);
		//System.out.println("......cId:"+cId);
		ConnectionSpeed findByconnectionName = connectionRepo.findByconnectionName(id);
		System.out.println("...>"+findByconnectionName);
		ApplicantDetails rg=new ApplicantDetails();
		rg.setServiceProvider(pId);
		rg.setConnectionSpeed(findByconnectionName);
		rg.setName(name);
		rg.setMailId(email);
		rg.setMobileNumber(number);
		rg.setDateOfBirth(new SimpleDateFormat("dd/MM/YYYY").parse(date));
		rg.setGender(gender);
		rg.setFile(img.getOriginalFilename());
		applicantRepo.save(rg);
		return "redirect:./test";

	}
	
	@GetMapping("/allData")
	public String allData(Model model) {
		List<ApplicantDetails> findAll = applicantRepo.findAll();
		System.out.println("the data is:"+findAll);
		model.addAttribute("allApplicantList",findAll);
		return "redirect:./test";
		
	}
	@GetMapping("/search")
	public String searchData(@RequestParam("pName") Integer pName,Model model){
		List<ApplicantDetails> findById = applicantRepo.findAll(pName);
		System.out.println("...."+findById);
		//model.addAttribute("allApplicantList",applicantRepo.findAll());
		model.addAttribute("allApplicantList",findById);
		model.addAttribute("seviceList",serviceRepo.findAll());
		return "index";
		
		
	}
	
	

}
