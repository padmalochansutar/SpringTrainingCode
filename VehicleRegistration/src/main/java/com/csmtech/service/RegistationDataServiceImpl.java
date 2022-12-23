package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.RegistationData;
import com.csmtech.repository.RegistationDataRepository;
@Service
public class RegistationDataServiceImpl implements RegistationDataService {
	@Autowired
	private RegistationDataRepository registationDataRepository;

	@Override
	public void saveData(RegistationData registationData) {
		registationDataRepository.save(registationData);

	}

	@Override
	public List<RegistationData> login(Long mno, String pwd) {
		return registationDataRepository.findIdpwd(mno,pwd);
		
	}

}
