package com.csmtech.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.Document;
import com.csmtech.repository.DocumentRepository;

import ch.qos.logback.core.net.SyslogOutputStream;
@Service
public class DocumentServiceImpl implements DocumentService {
	@Autowired
	private DocumentRepository documentRepository;

	@Override
	public String saveUploadedfile(MultipartFile file) {
		System.out.println("the file document is:"+file);
		String docId=null;
//		File f=new File("E:/upload/"+file.getOriginalFilename());
	//	BufferedOutputStream bf=null;
//		try {
//			byte[] bytes=file.getBytes();
//			bf = new BufferedOutputStream(new FileOutputStream(f));
//			bf.write(bytes);
//			bf.close();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		//String pic1="E:/upload/"+file.getOriginalFilename();
		if(!(file.isEmpty())) {
			System.out.println("the if file is:"+file);
			
			Document document=new Document();
			document.setDocument_name(file.getOriginalFilename());
			System.out.println(document.getDocument_name());
			document.setDocument_type(file.getContentType());
			
			try {
				document.setFile(file.getBytes());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
				
				
			System.out.println("the save document is:"+document);
			Document doc=documentRepository.save(document);
			docId=doc.getDocument_id().toString();
			System.out.println("documentId is"+docId);
		
		
	}
		return docId;
	}
	

	@Override
	public Document getDocument(Integer documentID) {
	Document document= documentRepository.findById(documentID).get();
		return document;
	}

}
