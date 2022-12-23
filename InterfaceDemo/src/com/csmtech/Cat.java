package com.csmtech;

public abstract class Cat implements Animal {//concrete class
    
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("veg/non-veg"+height);
	}

	/*
	 * @Override public void lives() { // TODO Auto-generated method stub
	 * System.out.println("house"); }
	 */
	

}
