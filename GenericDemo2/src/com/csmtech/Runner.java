package com.csmtech;

//import com.csmtech.runner.Concat;

class Concat{
	public <T extends String,M extends String>String m1(T s1,M s2){
		return s1.concat(s2);
	}
}
public class Runner {
	public static void main(String[] args) {
		Concat c=new Concat();
		System.out.println(c.m1("abc", "fdef"));
		
	}
}