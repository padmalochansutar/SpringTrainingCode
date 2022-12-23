package com.csmtech;

public class Secretary extends Employee {
         private String department;

		public Secretary(String eName, int eStaffid, int amountYear, double salary, int hours, String department) {
			super(eName, eStaffid, amountYear, salary, hours);
			this.department = department;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		public int getHours() {
			return hours+5 ;
		}
		public void setHours(int hours) {
			this.hours = hours;
		}
		public int salaryIncreased() {
			if(amountYear==oneyear) {
				System.out.println(getSalary()+500);
			}
			return salaryIncreased();
				
		}

		@Override
		public String toString() {
			return "Secretary [department=" + department + ", amountYear=" + amountYear + ", salary=" + salary
					+ ", hours=" + hours + "]";
		}
		

		
	}


