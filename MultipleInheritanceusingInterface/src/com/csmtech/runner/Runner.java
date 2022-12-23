package com.csmtech.runner;

import com.csmtech.ClassC;
import com.csmtech.ClassX;
import com.csmtech.InterfaceA;
import com.csmtech.InterfaceB;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    InterfaceB classc=new ClassC();
    // classc.m1();
     classc.m2();
    // classc.X();
     classc.n1();
     ClassX x=(ClassX)classc;//objectcasting
     x.X();
     InterfaceA a=(InterfaceA)classc;//objectcasting;
     a.m1();
     
	}

}
