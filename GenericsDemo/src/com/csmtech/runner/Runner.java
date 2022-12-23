package com.csmtech.runner;

import java.awt.print.Book;

interface Liquid{
	String taste();
}
class Fluid{
	
}
            //bounded type parameter
class Glass<T extends Fluid &Liquid>{  //class level generics//in type information when you want to bounded type then write only extends not implements
	private T liquid;
	public Glass(T liquid){
		this.liquid=liquid;
	}
	public String getTaste() {
		return liquid.taste();
	}
	
	
	@Override
	public String toString() {
		return "Glass [liquid=" + liquid + "]";
	}
	
}
class Water extends Fluid implements Liquid{

	@Override
	public String taste() {
		return "normal";
	}
	
}
class Juice extends Fluid implements Liquid  {

	@Override
	public String taste() {
		return "yammy";
	}
	
}
class Petrol implements Liquid{

	@Override
	public String taste() {
		return "good";
	}
	
}
class Colour<R,G,B> {
	public Colour() {}
	public Colour(R red,G green,B blue) {
		
	}
}
class Red{}
class Green{}
class Blue{}
class Concat{
	public <T extends String,M extends String>String m1(T s1,M s2){
		return s1.concat(s2);
	}
}


class Bartender{
	public<J extends Liquid,W extends Liquid> void mix(J juice,W water) {//method level generic Syntax
		
	}
}
public class Runner {
	public static void main(String[] args) {
		/*
		 * Glass<String>glass=new Glass<String>("abc");
		 * //Glass<Book>glass1=new Glass<Book>(); //Glass<Integer>glass2=new
		 * Glass<Integer>();
		 * 
		 * System.out.println(glass); Glass<Integer>glass1=new Glass<Integer>(1234);
		 * System.out.println(glass1); Glass<String>glass2=new Glass<String>();
		 * glass2.liquid="abc"; System.out.println(glass2);
		 */
		Glass<Water> waterGlass=new Glass<Water>(new Water());
		Glass<Juice> juiceGlass=new Glass<Juice>(new Juice());
		System.out.println(juiceGlass.getTaste());
		 System.out.println(waterGlass.getTaste());
		//Glass<Petrol>petrolGlass=new Glass<Petrol>();
		Colour color=new Colour();
		//Colour<Red,Green,String>colour1=new Colour<Red,Green,String>(new Red(),new Green(),"");//un-bounded types
		Colour<Red,Green,Blue>colour1=new Colour<Red,Green,Blue>(new Red(),new Green(),new Blue());
		Bartender bartender=new Bartender();
		bartender.mix(new Juice(),new Water());
		//bartender.mix("abc",123);//unbounded parameters
		//bounded parameters
		Concat c=new Concat();
		System.out.println(c.m1("abc", "fdef"));
		
	}
}
