class A{
	private int a;
	public A(int a) {
		this.a=a;
		System.out.println(a);
	}
	public void m1() {
		System.out.println("this m1 is class A");
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B extends A{
	private int b;
	public B(int b,int a) {
		super(a);
		this.b=b;
		System.out.println(b);
	}
	public void m2() {
		System.out.println("this m2 is class B");
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", toString()=" + super.toString() + "]";
	}
	
}
class C extends B{
	private int c;
	public C(int c,int b,int a) {
		super(b,a);
		this.c=c;
		System.out.println(c);
	}
	public void m3() {
		System.out.println("this m3 is class c");
	}
	@Override
	public String toString() {
		return  "C(c=" + c + ", toString()=" + super.toString() + ")";
	}
	
	
	
}
public class Test {
	public static void main(String[] args) {
		/*
		 * C c=new C(2,3,4); c.m1();
		 */
		//System.out.println(new C(2,3,4));
		C c=new C(2,3,4);
		A a=new A(5);
		System.out.println(c instanceof A);
		System.out.println(a instanceof C);
	}
	
}
