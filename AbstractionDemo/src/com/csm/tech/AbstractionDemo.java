package com.csm.tech;
/*abstract class Animal{
	public abstract void eat() ;//implemented method
	public abstract void lives();	
}*/

/*
 * abstract class Rabbit extends Animal{//rabbit is concrete class beacuse
 * rabbit provides parent implementation public void eat() {//override the
 * parentclass abstarct method in child class
 * System.out.println("Rabbit eats veg"); }
 * 
 * } class NewRabbit extends Rabbit{ public void eat() {
 * System.out.println("Rabbit eat veg/nonveg"); }
 * 
 * @Override public void lives() { System.out.println("Rabbit lives in bushes");
 * 
 * }
 * 
 * }
 */
abstract class MyMath{
	private int x;
	private int y;
	MyMath(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
    public int getY() {
		return y;
	}
    public static double getpi() {
    	return Math.PI;
    } 
  abstract int add();

@Override
public String toString() {
	return "MyMath [x=" + x + ", y=" + y + "]";
}
  
}
class NewMath extends MyMath{
	public NewMath(int x,int y){
		super(x,y);
	}
	public int add() {
		return getX()+getY();
	}
}
public class AbstractionDemo   {
	public static void main(String[]args) {
		//System.out.println(new NewMath(4,9).add());
		//System.out.println(new NewMath(4,9));
		//System.out.println(MyMath.getpi());
		MyMath mymath=new NewMath(4,9);
		System.out.println(mymath);
		System.out.println(mymath.getpi());
	}
   

}
