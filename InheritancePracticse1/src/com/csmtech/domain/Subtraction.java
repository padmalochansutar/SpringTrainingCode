package com.csmtech.domain;

public class Subtraction extends Number {
       public Subtraction(int n1,int n2) {
    	   super(n1,n2);
       }
  

	public int returnSub() {
    	   return getN1()-getN2();
       }
}
