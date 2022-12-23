package com.csmtech;

public class Student {
	private int rollNo;
	private String sName;
	//it is a non-instance property because declare static variable
	private static String schoolName;/*"CSM _High school";*/
    private double mark;//instance property;
    {
    	//the value is fixed ....we cannot change the value.....so thats why we will go to constructor or setter and getter method 
    }
    static{
    	schoolName="csm-high school";
    }
    public static String getSchoolName() {
    	return schoolName;
    }
    //1st step
   public Student(int rollNo,String sName,double mark){
		/* rollNo=101; sName="Anil"; mark=76.5; */
		/*
		 * rollNo=rn; sName=nm; mark=mk;
		 */
	   System.out.println(this);
	  this. rollNo=rollNo;
	   this.sName=sName;
	  this. mark=mark;
    }
   //2nd step
  public void setRollNo(int rollNo) {
	  this.rollNo=rollNo;
  }
  public int getRollNo() {
	  return rollNo;
  }
  public void setName(String sName) {
	  this.sName=sName;
  }
  public String getName() {
	  return sName;
  }
  
    
    
    
    
    
  private  char  findGrade(){
    	if(mark>=90) 
    		return 'A';
    		else if(mark>=80)
    			return 'B';
    		else if(mark>=60)
    			return 'C';
    		else 
    			return 'F';
    	
    }
    void displayGrade() {
    	System.out.println(sName+" grade is:"+findGrade());
    	System.out.println(schoolName);
    }
    public boolean compareStudent(Student s2) {
    	if(this.findGrade()==s2.findGrade())
    	return true;
    	else 
    		return false;
    } 
    public static boolean compareStudent(Student s1,Student s2) {
    	if(s1.findGrade()==s2.findGrade())
        	return true;
        	else 
        		return false;
    }
    /*public void getState() {
    	System.out.println("roll no:"+rollNo+"name:"+sName+"mark:"+mark);*/
	@Override
	public String toString() {//print state of the object or override purpose we will use
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", mark=" + mark + "]";
	}
    
    
    
    
    }
    

