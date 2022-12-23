package com.csmtech;





	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Arrays;
	import java.util.Date;
	import java.util.Scanner;


	class Student implements Serializable{
		private Integer eID;
		private String name;
		private Date dOfEnrollment;
		private String phoneNo;
		public Student(Integer i, String name, Date dateOfEnrollment, String phoneNo) {
			super();
			this.eID = i;
			this.name = name;
			this.dOfEnrollment = dateOfEnrollment;
			this.phoneNo = phoneNo;
		}
		public Integer getEnrollmentID() {
			return eID;
		}
		public void setEnrollmentID(Integer enrollmentID) {
			this.eID = enrollmentID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getDateOfEnrollment() {
			return dOfEnrollment;
		}
		public void setDateOfEnrollment(Date dateOfEnrollment) {
			this.dOfEnrollment = dateOfEnrollment;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			SimpleDateFormat fm= new SimpleDateFormat("dd-MM-yyyy");
			return "Student [enrollmentID=" + eID + ", name=" + name + ", dateOfEnrollment=" +fm.format( dOfEnrollment)
					+ ", phoneNo=" + phoneNo + "]";
		}
		
		
	}


}
