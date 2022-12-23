package com.csmtech.controller;

import com.csmtech.service.DeptServiceImpl;

public class DeptRunner {

	public static void main(String[] args) {
		System.out.println(new DeptServiceImpl().getAllDepts());
	}

}
