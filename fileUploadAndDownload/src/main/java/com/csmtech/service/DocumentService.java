package com.csmtech.service;

import org.springframework.web.multipart.MultipartFile;

import com.csmtech.model.Document;

public interface DocumentService {

	String saveUploadedfile(MultipartFile file);

	Document getDocument(Integer documentID);

}
