package com.csmtech;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstGenericServelt extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("initiallization done");
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method get called");
	}
	@Override
	public void destroy() {
		System.out.println("i am dieing");
	}

}
