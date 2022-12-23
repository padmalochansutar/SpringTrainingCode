package com.csmtech.service;

import java.util.List;
import java.util.Optional;

import com.csmtech.model.Registation;

public interface RegistationService {

	void fetchData(Registation rg);

	List<Registation> findData();

	List<Registation> searchData(Integer id);

}
