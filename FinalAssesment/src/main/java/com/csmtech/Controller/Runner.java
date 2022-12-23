package com.csmtech.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.Model.Connection;
import com.csmtech.Model.Provider;
import com.csmtech.Model.Registration;
import com.csmtech.Repository.ConnectionRepository;
import com.csmtech.Repository.ProviderRepository;
import com.csmtech.Repository.RegistrationRepository;

@Controller
public class Runner {
	@Autowired
	 ProviderRepository providerrepository;
	@Autowired
	 ConnectionRepository connectionrepository;
	@Autowired
	 RegistrationRepository registrationrepository;

	@GetMapping("/get")
	public String get(Model model)
	{
		model.addAttribute("data",registrationrepository.findAll());
		model.addAttribute("providerlist", providerrepository.findAll());
		return "userform";
		
	}
	@GetMapping("/connection")
	public void connection(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		PrintWriter pw= resp.getWriter();
		Integer id=Integer.parseInt(req.getParameter("con"));
		System.out.println(id);
		List<Connection> sl=connectionrepository.getallspeed(id);
		System.out.println(sl);
		String t="";
		for(Connection x:sl)
		{
			t+="<option value='"+x.getConnectionid()+"'>"+x.getSpeed()+"</option>";
		}
		System.out.println(t);
		pw.print(t);
		
	}
	@PostMapping("/save")
	public String saveData(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("mobile") String mobile,
			@RequestParam("gender") String gender,@RequestParam("dob") String dob,@RequestParam("image") MultipartFile image,@RequestParam("providerid") Integer providerid,
			@RequestParam("connectionid") Integer connectionid)
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		Registration rege=new Registration();
		rege.setName(name);
		rege.setEmail(email);
		rege.setMobile(mobile);
		rege.setGender(gender);
		try {
			rege.setDob(sdf.parse(dob));
			Connection c=new Connection();
			c=connectionrepository.findById(connectionid).get();
			System.out.println(c);
			rege.setConnection_id(c);
			Provider p=new Provider();
			p=providerrepository.findById(providerid).get();
			rege.setProvider_id(p);
			rege.setImage(image.getOriginalFilename());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file=new File("D:/Allfile/"+image.getOriginalFilename());
		BufferedOutputStream bf=null;
		
		
		
		try {
			byte[] b=image.getBytes();
			bf=new BufferedOutputStream(new FileOutputStream(file));
			bf.write(b);
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(rege);
		Registration s=registrationrepository.save(rege);
		System.out.println(s);
		return "redirect:./get";
		
	}
	
	@GetMapping("/getdetails")
	public String getdetails(@RequestParam("providerid") Integer providerid,Model model) {
		if(providerid==0) {
			return "redirect:./get";
		}else {
			System.out.println(registrationrepository.findAll());
			model.addAttribute("data", registrationrepository.getalldetail(providerid));
			model.addAttribute("providerlist", providerrepository.findAll());
			return "userform";
		}
		
	}
	
}
