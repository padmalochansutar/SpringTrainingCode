package com.csmtech.dao;

import com.csmtech.entity.ProductDto;
import com.csmtech.entity.ProductVo;

public interface ProductDao {
	 Integer saveProduct(ProductDto  productDto);
}
