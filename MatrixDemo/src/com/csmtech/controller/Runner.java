package com.csmtech.controller;

import java.util.Random;

import com.csmtech.Matrix;

public class Runner {

	public static void main(String[] args) {
       Matrix mat1=new Matrix(2,3);
       Matrix mat2=new Matrix(2,3);
       Random r=new Random();
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<3;j++) { 
    		   mat1.setM(i, j,r.nextInt(10));
			   mat2.setM(i, j, r.nextInt(10));
			   }
    	   }

}
}
