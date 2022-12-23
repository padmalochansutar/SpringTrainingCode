package com.csmtech;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("First");
		String s="amit";
		int a=5,b=2;
		
			/*try {
			System.out.println(a/b);
		}catch(ArithmeticException ae) {
			System.out.println("dont send zero as int value:"+ae);
			try {
				System.out.println(s.toString());
		}catch(NullPointerException an) {
			System.out.println("sucessly proceed");
		}*/
		try {
			System.out.println(s.toString());
			System.out.println(a/b);
			System.out.println(new int[] {3,4,5}[7]);
		}catch(NullPointerException an) {
			System.out.println("sucessly proceed");
		}catch(ArithmeticException ae) {
			System.out.println("dont send zero as int value:"+ae);
		}catch(RuntimeException ae) {
			System.out.println(ae);
		}catch(Exception ae) {
			System.out.println(ae);
		}
		System.out.println("second");
		
	}

}

