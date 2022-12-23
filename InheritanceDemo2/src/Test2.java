class P1{
	private float n1;
	public P1(float n1) {
		this.n1=n1;
	}
	public void printN1() {
		System.out.println("the value of n1:"+n1);
	}
	
}

class C1 extends P1{
	private String name;
	public C1(String name,float n1 ) {
		super(n1);
		this.name=name;
	}
	public void printName() {
		System.out.println("Name is:"+name);
	}
} 
class D1 extends C1{
 private boolean employeeid;
 public D1(boolean employeeid,String name,float n1) {
	 super(name,n1);
	 this.employeeid=employeeid;
 }
 public boolean isEmployeed() {
	  return employeeid;
	
	}
 
}
class C2 extends P1{
	private double height;
	public C2(double height,float n1) {
		super(n1);
		this.height=height;
	}
}

public class Test2 {
   public static void main(String[] args) {
	D1 d=new D1(false, "rajesh", 22.5f);
    System.out.println(d.isEmployeed());
	d.printName();
	d.printN1();
}
}
