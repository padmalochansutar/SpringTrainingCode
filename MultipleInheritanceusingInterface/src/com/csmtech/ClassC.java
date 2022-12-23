package com.csmtech;

 public class ClassC extends ClassX implements InterfaceA, InterfaceB {

	public void m1() {
		// TODO Auto-generated method stub
      System.out.println("m1 method of interfaceA");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method of interfaceB");
	}

	@Override
	public void n1() {
		// TODO Auto-generated method stub
		System.out.println("it is n1()");
	}

}
