package com.csmtech.domain;

import com.csmtech.Rectangle;

public class Runner {
    public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setHeight(5);
		r.setWeidth(3);
		System.out.println(r.findArea());
	}
}
