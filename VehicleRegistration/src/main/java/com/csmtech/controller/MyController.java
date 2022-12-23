package com.csmtech.controller;

import java.awt.Image;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.RegistationData;
import com.csmtech.model.Vehicle;
import com.csmtech.service.DistrictService;
import com.csmtech.service.RegistationDataService;
import com.csmtech.service.StateService;
import com.csmtech.service.VehicleService;

@Controller
public class MyController {

	@Autowired
	private StateService stateService;
	@Autowired
	private DistrictService districtService;
	@Autowired
	private RegistationDataService registationDataService;
	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("/test")
	public String data(Model model) {
		model.addAttribute("districtList", districtService.findDistData());
		model.addAttribute("stateList", stateService.findData());
		return "registationPage";
	}

	@GetMapping("/saveData")
	public String saveData(@ModelAttribute("RegistationData") RegistationData registationData) {
		registationDataService.saveData(registationData);
		return "loginPage";

	}

	@GetMapping("/login")
	public String loginData(@RequestParam("mobileno") Long mno, @RequestParam("password") String pwd, Model model) {
		RegistationData registation = new RegistationData();
		List<RegistationData> registationData = registationDataService.login(mno, pwd);
		for (RegistationData rg : registationData) {
			if (rg.getMobileno().equals(mno)) {
				if (rg.getPassword().equals(pwd)) {

					model.addAttribute("regiList", rg);
				}

			}
		}
		return "applicantList";

	}

	@GetMapping("/vehicleAdd")
	public String vehicleAdd() {
		return "vehicleAdd";
	}

	@PostMapping("/vehicleSaveData")
	public String vehicleInsert(@RequestParam("img") MultipartFile img,@RequestParam("regno") String rno, @RequestParam("state") String state,
			
			 @RequestParam("eimage2")MultipartFile eimage2,

			@RequestParam("pdate") String pdate, @RequestParam("fdate") String fdate,
			@RequestParam("rdate") String rdate) {

            File file=new File("E:/vehicleFile/"+img.getOriginalFilename());
            BufferedOutputStream bf=null;
            try {
				byte[] bytes=img.getBytes();
				bf=new BufferedOutputStream(new FileOutputStream(file));
				bf.write(bytes);
				bf.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		
		  File file1 = new File("E:/vehicleFile/" + eimage2.getOriginalFilename());
		  BufferedOutputStream bf1 = null; try { byte[] bytes = eimage2.getBytes(); bf1
		  = new BufferedOutputStream(new FileOutputStream(file1)); bf1.write(bytes);
		  bf1.close(); } catch (IOException e1) { e1.printStackTrace(); }
		 
		Vehicle vehicle = new Vehicle();
		vehicle.setRegno(rno);
		vehicle.setState(state);
		vehicle.setExtraImage1("E:/vehicleFile/" +img.getOriginalFilename());
		vehicle.setExtraImage2("E:/vehicleFile/" + eimage2.getOriginalFilename());

		try {
			vehicle.setPvalidity(new SimpleDateFormat("yyyy-MM-dd").parse(pdate));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		try {
			vehicle.setFvalidity(new SimpleDateFormat("yyyy-MM-dd").parse(fdate));
		} catch (ParseException e) {

			e.printStackTrace();
		}

		try {
			vehicle.setRvalidity(new SimpleDateFormat("yyyy-MM-dd").parse(rdate));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		System.out.println(vehicle);

		vehicleService.saveData(vehicle);

		return null;

	}
}
