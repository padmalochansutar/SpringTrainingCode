package com.csmtech.runner;

import java.util.Scanner;

import com.csmtech.AbstractClassA;
import com.csmtech.ClassA;
import com.csmtech.InterfaceA;
import com.csmtech.InterfaceB;

public class Runner {
public static void main(String[] args) {
	/*//ClassA classA=new ClassA();
	//System.out.println(classA.add(5, 4));
   int r=new ClassA() {
	   @Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}
   }.add(4, 5);
   System.out.println(r);
}*/
	/*
	 * AbstractClassA aca=new AbstractClassA() {
	 * 
	 * @Override public int add(int x, int y) { // TODO Auto-generated method stub
	 * return x+y; }
	 * 
	 * }; System.out.println(aca.add(5,7));
	 */
    /*InterfaceA interfacea=new InterfaceA() {//inner class implementing interface

		@Override
		public int add(int x, int y) {
			// TODO Auto-generated method stub
			return x+y;
		}*/
    	
	/*
	 * }; System.out.println(interfacea.add(5,4));
	 */
	//lambda Expression
	/*
	 * InterfaceA interfaceA=(x, y)-> x+y;//implementation ;//for int
	 * System.out.println(interfaceA.add(6,9));
	 */
	//InterfaceB interfaceB=(x,y)->System.out.println(x+y);//for void 
	//interfaceB.add(6,9);
	//InterfaceB interfaceB=(x,y,z)->(x+y+z)/3;
	//System.out.println(interfaceB.avg(5,6,7));

   InterfaceB interfaceB=()->{
	   Scanner sc=new Scanner(System.in);
	   int x,y;
	   x=sc.nextInt();
	   y=sc.nextInt();
	   return x+y;
   };
   System.out.println(interfaceB.add());
}
}

