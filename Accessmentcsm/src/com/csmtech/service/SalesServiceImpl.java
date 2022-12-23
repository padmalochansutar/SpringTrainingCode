package com.csmtech.service;

import com.csmtech.dao.ProductDao;
import com.csmtech.dao.ProductDaoImpl;
import com.csmtech.dao.SalesDao;
import com.csmtech.dao.SalesDaoImpl;
import com.csmtech.entity.Customer;
import com.csmtech.entity.Product;
import com.csmtech.entity.Sales;

public class SalesServiceImpl implements SalesService {

	
	@Override
	public void saveSales(Sales sales) {
		Product product=new ProductServiceImpl().getProductById(sales.getProdId());
		
		
		
		Double sRate=product.getProdRate();
		Double sAmount=sales.getsQty()*product.getProdRate();
		Integer id=sales.getProdId();
		Integer minsQty=product.getProdQty()-sales.getsQty();
		new ProductServiceImpl().updateQty(id,minsQty);
		
		sales.setsRate(sRate);
		sales.setsAmount(sAmount);
		
		
		SalesDao salesDao=new SalesDaoImpl();
		 salesDao.saveSales(sales);	
	}

	

}
