package com.csmtech.runner;

import com.csmtech.InterfaceA;
import com.csmtech.InterfaceAimpl;

public class Runner {
 public static void main(String[]args) {
	 InterfaceA interfacea=new InterfaceAimpl();
	 System.out.println(interfacea.add(5,3));
	 System.out.println(interfacea.mul(6,3));
	 System.out.println(interfacea.mul(6f,3f));
     InterfaceA.m1();
 }
 
}
