package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Product;

public interface ProductService {

	List<Product> getAllNames();

	Product getProductById(Integer prodId);
	void updateQty(Integer id, Integer minsQty);

}
