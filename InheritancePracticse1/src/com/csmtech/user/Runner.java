package com.csmtech.user;

import com.csmtech.domain.Addition;
import com.csmtech.domain.Subtraction;

public class Runner {
   public static void main(String[] args) {
	
		Addition a=new Addition (5,6);
		System.out.println(a);
	 System.out.println("Addition is:"+(a.returnAdd()));

	Subtraction s=new Subtraction(8, 7);
	System.out.println("Subtraction  is:"+(s.returnSub()));
}
}
