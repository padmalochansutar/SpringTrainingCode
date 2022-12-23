package com.csmtech.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.Model.Provider;
import com.csmtech.Model.Subscriptiontime;
import com.csmtech.Model.User;
import com.csmtech.Repository.ProviderRepository;
import com.csmtech.Repository.SubscriptiontimeRepository;
import com.csmtech.Repository.UserRepository;
import com.csmtech.utils.CommonFileUpload;

@Controller
public class MainController {
	@Autowired
	private ProviderRepository providerRepository;
	@Autowired
    private SubscriptiontimeRepository subscriptiontimeRepository;
	@Autowired
	private UserRepository userRepository;
	
    
	
	@RequestMapping("/index")
	public String index(Model model)
	{
		
			List<Provider> listprovider=providerRepository.findAll();
		    List<Subscriptiontime> listTime=subscriptiontimeRepository.findAll();
		    List<User>userList=userRepository.findAll();
		model.addAttribute("userList",userList);
		model.addAttribute("listTime",listTime);
		model.addAttribute("listprovider",listprovider);
		
		return "index";
		
	}
	@RequestMapping("/save")
	public String save(@RequestParam(value="id",required = false) Long id,@RequestParam("name") String sname,@RequestParam("providerid") Provider providerid,@RequestParam("subscription") Subscriptiontime subscription,@RequestParam("email") String email,
			@RequestParam("mobile") String mobile,@RequestParam("dob") String dob ,@RequestParam("gender") String gender, 
			
			@RequestParam("image") MultipartFile userImage)
	{
		User reg= new User();
		reg.setId(id);
		reg.setUsername(sname);
		reg.setProvider(providerid);
		reg.setSubscriptiontime(subscription);
		reg.setEmail(email);
		reg.setMobile(mobile);
		reg.setDob(dob);
		reg.setGender(gender);
		File file=new File("D:/Myfile1/" + userImage.getOriginalFilename());
		BufferedOutputStream bf=null;
		byte[] bytes;
		try {
			bytes = userImage.getBytes();
			bf = new BufferedOutputStream(new FileOutputStream(file));
			bf.write(bytes);
			bf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		reg.setUpload((userImage.getOriginalFilename()));
		userRepository.save(reg);
		
		
		
		
		return "redirect:./index";
	}
	@RequestMapping("/view")
	public String view(Model model)
	{
		List<Provider> listprovider=providerRepository.findAll();
	    List<Subscriptiontime> listTime=subscriptiontimeRepository.findAll();
	    List<User>userList=userRepository.findAll();
	model.addAttribute("userList",userList);
	model.addAttribute("listTime",listTime);
	model.addAttribute("listprovider",listprovider);
		return "view";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("providerid") Long providerid, @RequestParam("subscription") Long subscription, Model model)
	{
		System.out.println(providerid);
		List<User> listreg=userRepository.getNameById(providerid,subscription);
		
		System.out.println(listreg);
	    List<Subscriptiontime> listTime=subscriptiontimeRepository.findAll();
	    List<User>userList=userRepository.findAll();
	    model.addAttribute("userList",listreg);
		
//	model.addAttribute("listprovider",listprovider);
		return "view";
	}
	

	@RequestMapping(path = "/getFees")
	public void getFees(HttpServletRequest req, HttpServletResponse resp, @RequestParam("provider") Long provider)
			throws IOException {
		System.out.println(provider);
		PrintWriter pw = resp.getWriter();
		Double feesOfBranch=subscriptiontimeRepository.getFees(provider);
		System.out.println(feesOfBranch);
		pw.print(feesOfBranch);
	}
	@GetMapping("/downloadFile")
	public void downloadFile(@RequestParam("id") Long id, HttpServletResponse response) throws IOException {
		System.out.println("Inside Download File--------->>");
		User user = userRepository.getApplicantByapplicantId(id);
		CommonFileUpload.downloadFile(response, user.getUpload());
	}
	
	
	
	
}
