package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.ProductDao;
import com.csmtech.dao.ProductDaoImpl;
import com.csmtech.entity.Product;

public class ProductServiceImpl implements ProductService {
	


	@Override
	public List<Product> getAllNames() {
		
		return new ProductDaoImpl().getAllNames();
	}

	public Product getProductById(Integer prodId) {
		
		
		return new ProductDaoImpl().getProductById(prodId);
	}

	public void updateQty(Integer id, Integer minsQty) {
		new ProductDaoImpl().updateQty(id,minsQty);
		
	}

	
	

}
