package com.csmtech.service;



import com.csmtech.dao.ProductDaoImpl;
import com.csmtech.entity.ProductMaster;

public class ProductMasterServiceImpl implements ProductMasterService  {

	public ProductMaster getProductById(Long prodId) {
		return new ProductDaoImpl().getProductById(prodId);
	}

	

	
	}
	
	


