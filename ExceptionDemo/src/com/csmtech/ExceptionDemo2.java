package com.csmtech;

public class ExceptionDemo2 {
	static void m3() {
		System.out.println(" m3() begins");
		
	    System.out.println(5/0);
		
		System.out.println("m3()ends");
	}
	static void m2() {
		System.out.println("i am in m2() begins");
				m3();
		
		
		System.out.println("m2()ends");
		
	}
	static  void m1() {
		System.out.println("i am in m1() begins");
		m2();
		System.out.println("m1()ends");
	}
	
	
	
    public static void main(String[] args) {
    	System.out.println("main() begins");
    	try {
		m2();
    	}catch(ArithmeticException ae) {}
		System.out.println("main()ends");
		
	}
}
