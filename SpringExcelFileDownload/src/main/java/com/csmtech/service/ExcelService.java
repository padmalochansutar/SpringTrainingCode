package com.csmtech.service;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.helper.ExcelHelper;
import com.csmtech.model.Tutorial;
import com.csmtech.repository.TutorialRepository;

@Service
public class ExcelService {
	@Autowired
	private TutorialRepository tutorialRepository ;

	
	 public ByteArrayInputStream load() {
		    List<Tutorial> tutorials = tutorialRepository.findAll();

		    ByteArrayInputStream in = ExcelHelper.tutorialsToExcel(tutorials);
		    return in;
		  }
}
