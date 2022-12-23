package com.csmtech;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class NestedException {

	public static void main(String[] args) {
         int A[]= {1,2,3} ;
		//String s=null;
		/*
		 * String s="amit"; int a=6,b=0; try {//parent System.out.println(a/2);//belongs
		 * to outer try try {//child System.out.println(s.length());//belongs to innner
		 * try }catch(ArrayIndexOutOfBoundsException Ape) {
		 * 
		 * }
		 * 
		 * }catch(ArithmeticException ae) {System.out.println("outer try");
		 * }catch(NullPointerException ane) {}
		 * 
		 */
		/*
		 * try { System.out.println(s.length()); }catch(NullPointerException npe) {
		 * System.out.println("npe handled"); }finally {
		 * System.out.println("i am in finally"); }
		 */
        // for(int i=0;i<4;i++) {
        	 try {
        	 //System.out.println(A[7]);
        		 throw new ArrayIndexOutOfBoundsException();
        	 
         }catch(ArrayIndexOutOfBoundsException aiob){ 
        	// System.out.println(aiob.getMessage());//Index 7 out of bounds for length 3
        	 //System.out.println(aiob.toString());////java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 3
        	 
        	 //aiob.printStackTrace();}//java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 3
        		//at com.csmtech.NestedException.main(NestedException.java:28)

         }
		
		
	}
}


