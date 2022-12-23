package com.csmtech.runner;

import com.csmtech.Employee;

public class Runner {

	public static void main(String[] args) {
            Employee e=new Employee();
            e.setEmployeeNo(100);
            e.seteName("rajesh");
            e.setEsalary(10000);
            System.out.println(e.getEsalary());
            e.increaseSalary();
            
	}

}
