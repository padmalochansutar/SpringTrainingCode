package com.csmtech.domain;

public class Addition extends Number {
		public Addition(int n1,int n2) {
			super(n1,n2);
			
		}
		public int returnAdd() {
			return getN1()+getN2();
		}
}
