package csm.comtech;

import java.util.Scanner;

public class ArrayObjects {
	public static void main(String[] args) {
		int i;
		//create an array object
		Scanner scn=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		Product[] obj=new Product[5]; 
		for( i=0;i<obj.length;i++) {
			System.out.println("Enter product id");
			int pid=scn.nextInt();
			System.out.println("Enter product Name");
			String pname=sc.nextLine();
			obj[i]=new Product(pid, pname);
		}
		for( i=0;i<obj.length;i++)
		obj[i].display();
	}

}
