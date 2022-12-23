package com.csmtech;

public class Administrator extends Employee {
	private String principalName;
	private String vicePrincipalName;
	public Administrator(String eName, int eStaffid, int amountYear, double salary, int hours, String principalName,
			String vicePrincipalName) {
		super(eName, eStaffid, amountYear, salary, hours);
		this.principalName = principalName;
		this.vicePrincipalName = vicePrincipalName;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getVicePrincipalName() {
		return vicePrincipalName;
	}
	public void setVicePrincipalName(String vicePrincipalName) {
		this.vicePrincipalName = vicePrincipalName;
	}
	public int getHours() {
		return hours+25;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int salaryIncreased() {
		int add=(int) (getSalary()+6000);
		if(amountYear==oneyear) {
			System.out.println(getSalary()+2000);
			
		}
		  return salaryIncreased() ;	
		}
	@Override
	public String toString() {
		return "Administrator [principalName=" + principalName + ", vicePrincipalName=" + vicePrincipalName
				+ ", amountYear=" + amountYear + ", salary=" + salary + ", hours=" + hours + "]";
	}
		
		

}
