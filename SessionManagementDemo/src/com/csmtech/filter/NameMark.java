package com.csmtech.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NameMark implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain)
			throws IOException, ServletException {
			resp.setContentType("text/html");
			PrintWriter pw=resp.getWriter();
			Integer mark=Integer.parseInt(req.getParameter("mark"));
			if(mark>0)
				filterChain.doFilter(req,resp);
			else
				pw.println("mark in -ve");
			
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
