package com.csmtech;

public class InterfaceAimpl implements InterfaceA,InterfaceB {

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		//return InterfaceB.super.mul(x, y);
		return x*y+20;
	}

}
