package com.csmtech.runner;

import java.util.Scanner;

import com.csmtech.EmailValidationProblem;

public class Runner {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	String s=scn.nextLine(); 
	EmailValidationProblem ev=new EmailValidationProblem ();
	
	System.out.println(ev.validation(s));
}
}

		


