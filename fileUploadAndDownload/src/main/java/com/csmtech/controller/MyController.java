package com.csmtech.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.csmtech.model.Document;
import com.csmtech.service.DocumentService;

@Controller
public class MyController {
	@Autowired
	private DocumentService documentService;
	
	@GetMapping("/test")
	public String test() {
		return "file";
	}
	@PostMapping("/save")
	public String savedata(@RequestParam("file") MultipartFile file,ModelMap map,Model model) {
		System.out.println("file is:"+file);
		String message="";
		String documentId="";
		
		if(file.isEmpty()) {
			message="could not upload the file";
			model.addAttribute("msg",message);
			return "file";
		}
		else {
			documentId=documentService.saveUploadedfile(file);
			message="uploaded the file sucessfully:"+file.getOriginalFilename();
		}
		String fileDownloadUrl=ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/").path(documentId).toUriString();
		
		map.put("message", message);
		map.put("downloadurl", fileDownloadUrl);
		System.out.println(fileDownloadUrl);
		
		return "download";
		}
		
	@GetMapping("/downloadFile/{documentId}")
	public void downloadFile(@PathVariable("documentId") Integer documentID,HttpServletResponse response) {
		
		Document document=documentService.getDocument( documentID);
		try {
		response.setHeader("content-Disposition", "inline;filename=\""+document.getDocument_name()+"\"");
		response.setContentType(document.getDocument_type());
		
		InputStream ins=new ByteArrayInputStream(document.getFile());
		
			IOUtils.copy(ins, response.getOutputStream());
		} catch (IOException e) {
		e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
		
		
	}


