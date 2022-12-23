package com.csmtech;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@AllArgsConstructor//meta data
@Setter
@Getter
@ToString

class Emp{
	private Integer empid;
	private String name;
	private String deptName;
	private Double salary;
	private Date hireDate;
	/*
	 * public String toString() { return
	 * empid+" "+name+" "+deptName+" "+salary+" "+new
	 * SimpleDateFormat("dd/MM/yyyy").format(hireDate); }
	 */
	/*
	 * public boolean equals(Object obj) { Emp emp =(Emp)obj;
	 * if(this.empid.intValue()==emp.empid.intValue() &&
	 * this.name.equals(emp.name)&& this.deptName.equals(emp.deptName) &&
	 * this.salary.doubleValue()==emp.salary.doubleValue() &&
	 * this.hireDate.equals(emp.hireDate)) return true; else return false;
	 * 
	 * }
	 */
	public boolean equals(Object obj) {
		Emp e =(Emp)obj;
		if(this.empid.intValue()==e.empid.intValue() && this.name.equals(e.name)&& this.deptName.equals(e.deptName) && this.salary.doubleValue()==e.salary.doubleValue() && this.hireDate.equals(e.hireDate))
		return true;
		else
			return false;
			
	}
}







public class ToStringDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*
		 * SimpleDateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
		 * 
		 * 
		 * Emp emp=new Emp(101,"amit","java",1000.00,fm.parse("10-02-2021"));
		 * System.out.println(emp); //System.out.println(emp.hashCode()); Emp emp1=new
		 * Emp(101,"amit","java",1000.00,fm.parse("10-02-2021"));
		 * 
		 * System.out.println(emp.equals(emp1));
		 * System.out.println(emp.getHireDate().equals(emp1.getHireDate()));
		 */
		Class c="Amit".getClass();
		System.out.println(c);//class java.lang.String
		Class c1=Integer.valueOf(12).getClass();
		System.out.println(c1);
		Class c2=new Emp(101,"amit","java",1000.00, null).getClass();
		System.out.println(c2);//class com.csmtech.Emp
		Class c3="Amit ".getClass();
		System.out.println(c3.getPackageName());
		
	}

}
