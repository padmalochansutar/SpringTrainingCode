package com.csmtech;

public class TestA {
	protected int sal;

public TestA(int sal) {
	super();
	this.sal = sal;
	}
	
	public int m1(int sal) {
		return sal;
		
	}

}
 class TestB extends TestA{
    protected int sal1;

	public TestB(int sal, int sal1) {
		super(sal);
		this.sal1 = sal1;
	}
    
    public int m1(int sal) {
    	return sal+sal1;
    }
}
 class TestC extends TestB{
	 private int sal2;

	public TestC(int sal, int sal1, int sal2) {
		super(sal, sal1);
		this.sal2 = sal2;
	}
	 public int m1() {
		 return sal+sal1+sal2;
	 }
	@Override
	public String toString() {
		return "TestC [sal2=" + sal2 + "]";
	}
	 
 } 
 class Runner{
	 public static void main(String[] args) {
		TestC t=new TestC(5,6,7);
		System.out.println(t);
	}
 }
