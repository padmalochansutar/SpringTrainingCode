package com.csmtech.service;

import java.util.List;

import com.csmtech.model.RegistationData;

public interface RegistationDataService {

	void saveData(RegistationData registationData);

	List<RegistationData> login(Long mno, String pwd);

}
