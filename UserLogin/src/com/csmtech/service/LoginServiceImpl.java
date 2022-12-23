package com.csmtech.service;

import com.csmtech.dao.LoginDao;
import com.csmtech.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {

	@Override
	public String getLogin(String uName, String uPwd) {
        LoginDao loginDao=new LoginDaoImpl();
         Integer res=loginDao.getLogin(uName,uPwd);
         if(res==0) {
        	 return "user invalid";
         }
         else  {
        	 if(res==1)
        	 return "pwd inavalid";
        	 else {
            	 return "user sucessfully";
             }
         }
         
         	

	}
}
