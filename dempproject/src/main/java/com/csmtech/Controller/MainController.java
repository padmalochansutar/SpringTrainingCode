package com.csmtech.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.Entity.Region;
import com.csmtech.Entity.Registation;
import com.csmtech.Entity.TempReg;
import com.csmtech.Repository.RegionRepository;
import com.csmtech.Repository.RegistrationRepository;
import com.csmtech.Repository.TempRegRepository;

@Controller
public class MainController {
	@Autowired
	private RegionRepository regionrepo;
	@Autowired
	private RegistrationRepository registrationrepo;
	@Autowired
	private TempRegRepository tempRepository;
	
	List<Registation> registrationlist=new ArrayList<Registation>();;
	
	@RequestMapping("/get")
	public String main()
	{
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(Model model)
	{
		registrationlist=new ArrayList<Registation>();
		List<Region>listregion=regionrepo.findAll();
		model.addAttribute("listregion",listregion);
		System.out.println(listregion);
		return "add";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute Registation reg,Model model)
	{
		registrationlist.add(reg);
//		registrationrepo.save(reg);
		List<Registation> listregi=registrationlist;
		model.addAttribute("listregi",listregi);
		List<Region>listregion=regionrepo.findAll();
		model.addAttribute("listregion",listregion);
		System.out.println("hi");
		return "add";
	}
	@RequestMapping("/submit")
	public String submit()
	{
		System.out.println(registrationlist);
		for(Registation x:registrationlist)
		{
			registrationrepo.save(x);
		}

		return "redirect:/add";
	}
	@RequestMapping("/view")
	public String view(Model model)
	{
		List<Region>listregion=regionrepo.findAll();
		model.addAttribute("listregion",listregion);
		List<Registation>registrationList=registrationrepo.findAll();
		model.addAttribute("registrationList",registrationList);
		return "view";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("regid") Long regid, Model model) {
		
		Registation st=registrationrepo.findByUserId(regid);
		model.addAttribute("st",st);
		System.out.println(st);
		return "forward:/add";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam("id") Long id, Model model)
	{
		List<Registation> registrationList=registrationrepo.getNameById(id);
		
	    model.addAttribute("registrationList",registrationList);
		System.out.println(registrationList);
		return "view";
	}
	@RequestMapping("/validateName")
	public void validateName(@RequestParam("facultyname") String facultyname,HttpServletResponse resp) throws IOException
	{
		PrintWriter pw=resp.getWriter();
		Registation registation=registrationrepo.findByfacultyname(facultyname);
		if(registation!=null) {
			pw.print(1);
		}
	}
	
	@RequestMapping("/validateAddress")
	public void validateAddress(@RequestParam("facultyaddress") String facultyaddress,HttpServletResponse resp) throws IOException
	{
		PrintWriter pw=resp.getWriter();
		Registation registation=registrationrepo.findByfacultyaddress(facultyaddress);
		if(registation!=null) {
			pw.print(1);
		}
	}
	
	@RequestMapping("/savetemp")
	public String savetemp(@ModelAttribute TempReg regt)
	{
		tempRepository.save(regt);
		return "redirect:/add";
	}
	
	
	
	
}
