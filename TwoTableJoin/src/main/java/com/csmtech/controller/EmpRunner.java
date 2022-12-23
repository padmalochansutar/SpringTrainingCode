

package com.csmtech.controller;

import java.util.List;
import java.util.Scanner;

import com.csmtech.entity.DeptVo;
import com.csmtech.entity.EmpVo;
import com.csmtech.service.DeptServiceImpl;
import com.csmtech.service.EmpServiceImpl;

public class EmpRunner {

	public static Boolean validateDeptId(String deptId,List<DeptVo> deptVoList) {
		for(DeptVo deptVo:deptVoList) {
			if(deptVo.getDeptId().equals(deptId))
				return true;
		}

		
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.viewall Employees\n2.Add an employee\n3.Exit ");
		int choice=sc.nextInt();
		do {
		switch(choice){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter Emp name:");
		String eName=ss.nextLine().trim();
		System.out.println("Enter Emp salary:");
		String esal=ss.nextLine().trim();
		System.out.println("Enter Emp hire date[dd/mm/yyyy]:");
		String ehDate=ss.nextLine().trim();
		System.out.println("Enter Emp's Dept id:");
		String dId=ss.nextLine().trim();
		
		if(validateDeptId(dId, new DeptServiceImpl().getAllDepts())){
		
		
			EmpVo empVo=new EmpVo();
			empVo.setEmpName(eName);
			empVo.setSalary(esal);
			empVo.setHireDate(ehDate);
			empVo.setDeptId(dId);
			
			System.out.println(new EmpServiceImpl().saveEmp(empVo)+" record(s) inserted");
		}
		else {
			System.out.println("Check dept id!!!");
		}
		}while();
		
		}
	

