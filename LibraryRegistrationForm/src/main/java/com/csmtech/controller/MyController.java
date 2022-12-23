/**
 * 
 */
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
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.csmtech.model.Library;
import com.csmtech.model.Registration;
import com.csmtech.model.Subscription;
import com.csmtech.repository.LibraryRepository;
import com.csmtech.repository.RegistrationRepository;
import com.csmtech.repository.SubscriptionRepository;
import com.csmtech.service.LibraryService;
import com.csmtech.service.RegistrationService;
import com.csmtech.service.SubscriptionService;

/**
 * @author bijayashree.bilas
 *
 */
@RequestMapping("/form")
@Controller
public class MyController {
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private LibraryService libraryService;

	@Autowired
	private SubscriptionService subscriptionService;
	
	@Autowired
	private LibraryRepository libraryrepository;
	
	@Autowired
	private RegistrationRepository registrationRepository;

	@Autowired
	private SubscriptionRepository subscriptionrepository;
	
	
	@GetMapping("/library")
	public String getProviders(Model model) {
		model.addAttribute("allLibraryList", libraryService.getAllLibraries());
		System.out.println(registrationService.getAllBooking());
		model.addAttribute("allBookingList", registrationService.getAllBooking());
		model.addAttribute("subscriptionList", subscriptionrepository.findAll());
		return "libraryRegForm";
	}
	
	@GetMapping("/getsubscriptionByLibraryId")
	public void getSubscription(@RequestParam("sId") Integer sId, Model model, HttpServletResponse resp)
			throws IOException {
		System.out.println("the sid is:"+sId);
		PrintWriter pw = resp.getWriter();
		System.out.println(sId);
		List<Subscription> subscriptionList = subscriptionService.allSubscriptionList(sId);
		//System.out.println("++++++++++++++++" + subscriptionList);
		String t = "";
		t += "<option value='" + 0 + "'>" + "--select--" + "</option>";
		for (Subscription x : subscriptionList) {
			t += "<option value='" + x.getSubscriptionId() + "'>" + x.getSubscriptionType() + "</option>";
		}
		pw.print(t);

	}
	@GetMapping("/getCostBySubscriptionId")
	public void getSubscriptionCost(@RequestParam("fId")Integer fId, Model model, HttpServletResponse resp)
			throws IOException {
		System.out.println(fId);
		Double subscriptionCost = subscriptionService.getCostByCid(fId);
		PrintWriter pw = resp.getWriter();
		pw.print(subscriptionCost);

	}
	@PostMapping("/saveDetails")
	public String saveLibraryDetails(@RequestParam(value="registrationId" , required = false)Integer registrationId,
			                    @RequestParam("applicantName") String name,
								@RequestParam("lName")Integer library,
								@RequestParam("sName")Integer subscription,
			                  	@RequestParam("email") String email,
			                  	@RequestParam("mobileNo")String mobileNo,
			                  	@RequestParam("dob") String dateOfBirth,
			                  	@RequestParam("gender") String gender,
									@RequestParam("idProof") MultipartFile userImage,Model model,RedirectAttributes redircts) throws Exception  {
		LocalDate today = LocalDate.now();
		System.out.println("today date is :"+today);
		LocalDate birthday = LocalDate.parse(dateOfBirth);
		System.out.println("th form date is:"+birthday);
		
		Period period = Period.between( birthday,today);
		int years = period.getYears();
		
		System.out.println("the age is:"+years);
										
		File file = new File("D:/myFile/"+userImage.getOriginalFilename());
		BufferedOutputStream bf= null;
		 
		try {
		
			byte[] bytes = userImage.getBytes();
			bf=new BufferedOutputStream(new FileOutputStream(file));
			bf.write(bytes);
			bf.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		Registration registration= new Registration();
		if(registrationId != null)
		registration.setRegistrationId(registrationId);
		registration.setApplicantName(name);
		registration.setEmail(email);
		registration.setMobileNo(mobileNo);
		registration.setAge(years);
		System.out.println(registration.getAge());
		if(registration.getAge()<12) {
			redircts.addFlashAttribute("Msg", "Age Graeter Than 12");
			
		}
		
		registration.setDob(new Date());
		
//		registration.setProvider(provider);
//		registration.setSubscription(subscription);
		
		
		
		registration.setGender(gender);
		String age="must be greater than 12";
		System.out.println("the age i:"+registration.getAge());
		
		registration.setIdProof("D:/myfile/"+userImage.getOriginalFilename());
		Library library1=new Library();
		library1=libraryrepository.findById(library).get();
		registration.setLibrary(library1);
		Subscription subscription1=new Subscription();
		subscription1=subscriptionrepository.findById(subscription).get();
		registration.setSubscription(subscription1);
		registration.setIsDelete("No");
		
		registrationService.saveAllBookingDetails(registration);
		
		return "redirect:./getData";
		
	}
	@GetMapping("/getData")
	public String searchList(Model model) {
		
		model.addAttribute("subscriptionList",subscriptionrepository.findAll());
		model.addAttribute("allLibraryList", libraryService.getAllLibraries());
		System.out.println(registrationService.getAllBooking());
		model.addAttribute("allBookingList",registrationService.getAllBooking() );
		return "libraryViewForm";
}
	
	@GetMapping("/search")
	public String search(@RequestParam("lName") Integer libraryId,@RequestParam("sName") Integer sId,Model model) {
		System.out.println("the library id is:"+libraryId);
		System.out.println("the sub id is:"+sId);
		model.addAttribute("subscriptionList",subscriptionrepository.findAll());
		model.addAttribute("allLibraryList", libraryService.getAllLibraries());
		if(libraryId!=0 && sId==0) {
			System.out.println(registrationRepository.findByLibraryId(libraryId));
			model.addAttribute("allBookingList",registrationRepository.findByLibraryId(libraryId));
			return "libraryViewForm";
		}
		else if(sId!=0) {
			model.addAttribute("allBookingList",registrationRepository.findBySubId(sId));
			System.out.println("the reg Id is:"+registrationRepository.findBySubId(sId));
		}
		else if(libraryId!=0 && sId!=0 ) {
			model.addAttribute("allBookingList",registrationRepository.findBylibAndSubId(libraryId,sId));
		}
		else if(libraryId==0 && sId==0 ) {
			model.addAttribute("allBookingList",registrationRepository.findAll());
		}
		return "libraryViewForm";
	}

	
	
	
	
	
	
	
	

}
