class A{
	public void change(int n1,int n2) {
		n1=n1+10;
		n2=n2+10;
	}
}
class B{
	private int n1;
	private int n2;
	public B(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public void change(B b) {
		b.n1=b.n1+10;
		b.n2=b.n2+10;
	}
	@Override
	public String toString() {
		return "B [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
}
public class Demo {
   public static void main(String[] args) {	
	  int n1=5,n2=15;
		/*
		 * A a=new A(); System.out.println(n1+" "+n2); a.change(n1,n2);
		 * System.out.println("n1="+n1 +" n2="+n2);
		 */
	  B b=new B(n1,n2);
	  System.out.println(b);
	  b.change(b);
	  System.out.println(b);
}
}
