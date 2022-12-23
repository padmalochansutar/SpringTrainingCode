package com.csmtech;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}





class P{
	/*
	 * public int m1() {//overriden method
	 * //System.out.println("i am in parent m1 ()"); return 0; }
	 */
	public C m1() {
		return new C();
	}
}

class C extends P{
	public int m1() {//overriding method
		
		//System.out.println("i am overriding parent m1()");
		//super.m1();//there is no restriction...super means immediate parent refernce
	     return 1;
	}
	public float m2() {
		return 0.1f;
	}
}
class C1 extends C{
	public int m1() {
		//super.m1();
		//System.out.println("i am overriding to c class");
		return 2;
		
	}
	public float m2() {
		System.out.println(super.m2());
		return 9;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // C c=new C(); c.m1();
		
		/*
		 * P p=new P(); p.m1();
		 */
		/*
		 * C c=new P();//Type mismatch: cannot convert from P to C c.m1()
		 */;
		/*
		 * P p=new C();//child class object must be stored in parent class reference
		 * p.m1();//runtime binding
		 */	
		/*
		 * C1 c=new C1(); c.m1();
		 */
		/*
		 * C c=new C(); c.m1();
		 */
		/*
		 * P p=new C1(); p.m1();
		 */
		/*
		 * P p=new C1(); p.m1();
		 */
		// P p=new C();
		 C c=new C1();
		 System.out.println(c.m2());
	}
	

}
