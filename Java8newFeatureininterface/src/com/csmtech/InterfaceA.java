package com.csmtech;

public interface InterfaceA {

     int add(int x,int y);
     
     default int mul(int x,int y) {
    	 return x*y;
     }
     default float mul(float x,float y) {
    	 return x*y;
     }
     static void m1() {
    	 System.out.println("i am in static method");
     }
}
