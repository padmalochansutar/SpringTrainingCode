package com.csmtech.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.User;
import com.csmtech.util.DbUtil;

public class UserDaoImpl implements UserDao {
   private Session session=null;
   

	@Override
	public void saveData(User user) {
		session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
		
		
	}

}
