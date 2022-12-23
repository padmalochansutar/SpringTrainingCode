package csm.comtech;

import java.util.Scanner;

public class Ruuner {
     public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the age of employee");
	    int age=scn.nextInt();
	    System.out.println("Enter the  employee are F/M");
	    String sex=sc.nextLine();
	    System.out.println("Enter the  marital status");
	    String mStatus=sc.nextLine();
	    Employee e=new Employee(age, sex, mStatus);
	    e.display();
	    
	    
	    
		
	}
}
