package com.csmtech;
class ErithmeticDemo{
	/*
	 * public int addInt(int n1,int n2) { return n1+n2; } public float
	 * addFloat(float n1,float n2) { return n1+n2; }
	 */
	/*
	 * public int add(int[] B) { int sum=0; for(int x:B) sum+=x; return sum; }
	 */
	public int add(int a,int b) {
		System.out.println("int,int version");
		return a+b;
	}
	
	public float add(float a,float b) {
		System.out.println("float,float version");
		return a+b;
	}
	public double add(double a,double b) {
		System.out.println("double,double version");
		return a+b;
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		/*System.out.println(new ErithmeticDemo().addFloat(4.2f,5.4f));*/
		//int[] A= {4,5};
		System.out.println(new ErithmeticDemo().add(23l,24l));
	}

}
