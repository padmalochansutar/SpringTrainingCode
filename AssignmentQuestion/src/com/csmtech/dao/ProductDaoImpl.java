package com.csmtech.dao;

import com.csmtech.entity.ProductMaster;
import com.csmtech.util.DbUtil;

public class ProductDaoImpl implements ProductDao {



	
	public ProductMaster getProductById(Long prodId) {
		return DbUtil.getSessionFactory().openSession().get(ProductMaster.class, prodId);
	}


}
