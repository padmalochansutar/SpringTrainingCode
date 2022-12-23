package com.csmtech.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.csmtech.entity.Product;
import com.csmtech.util.DbUtil;

public class ProductDaoImpl implements ProductDao{
	private Session session=null;
	private  Query query=null;
	public List<Product> getAllNames() {
		session=DbUtil.getSessionFactory().openSession();
		query=session.createQuery("from Product");
		List<Product> prodList=query.list();
		session.close();
		return prodList;
		
	}

	public Product getProductById(Integer prodId) {
		return  DbUtil.getSessionFactory().openSession().get(Product.class, prodId);
	}

	public void updateQty(Integer id, Integer minsQty) {
		session=DbUtil.getSessionFactory().openSession();
		Product product=session.get(Product.class, id);
		product.setProdQty(minsQty);
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.update(product);
		tx.commit();
		session.close();
		
		
	}

	

}
