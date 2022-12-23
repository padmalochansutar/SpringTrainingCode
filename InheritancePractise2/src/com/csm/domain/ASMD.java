package com.csm.domain;
class A{
	private int a;
	private int b;
	private int c;
	public A(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int Add() {
		return a+b+c;
	}
}
class B extends A{
	public B(int a, int b, int c) {
		super(a,b,c);
		
		}
	public int Avg(int n1,int n2) {
		return (n1+n2)/2;
	}
}
public class ASMD {

	public static void main(String[] args) {
		B b=new B(5, 4, 6);
		System.out.println(b.Avg(5,6));
		System.out.println(b.Add());

	}

}
