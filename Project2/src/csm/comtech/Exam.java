package csm.comtech;

import java.util.Scanner;

public class Exam {
       public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of class held:");
		int noclsHeld=scn.nextInt();
		System.out.println("Number of class attended:");
		int noClsAttend=scn.nextInt();
		System.out.println("he/she medical cause");
		String medicalc=sc.nextLine();
		System.out.println("The number of class held is:"+noclsHeld);
		System.out.println("The number of class attended is:"+noClsAttend);
		double percentage=noClsAttend*100/noclsHeld;
		System.out.println("percentage of class is:"+percentage);
		Student s=new Student(noClsAttend, noClsAttend, percentage,medicalc);
		s.examAllowed();
		
		
		
	}
       
}
