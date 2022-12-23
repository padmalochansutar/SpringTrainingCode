package com.csmtech;

import java.util.Arrays;

public class Matrix {
	private int nr;
	private int nc;
	private int M[][];
	public Matrix(int nr, int nc) {
		super();
		this.nr = nr;
		this.nc = nc;
		this.M=new int[nr][nc];
	}
	

	public int getNr() {
		return nr;
	}

	public int getNc() {
		return nc;
	}

	public int[][] getM() {
		return M;
	}

	
	public void printMatrix() {
   	 for(int i=0;i<M.length;i++)
   		 System.out.println(Arrays.toString(M[i]));
    }

	public void setM(int i,int j,int data) {
		M[i][j]=data;
	}
	public int getM(int i,int j) {
		return M[i][j];
	}
	public Matrix addMatrix(Matrix M2) {
		Matrix R=null;
	if((this.getNr()==M2.getNr())&&(this.getNc()==M2.getNc())) {
		 R=new Matrix(nr,nc);
		 for(int i=0;i<nr;i++) {
		    for(int j=0;j<nc;j++)
		    	R.setM(i,j,this.getM(i,j)+M2.getM(i, j));
		    	
		 }
		 }
	else
		System.out.println("Matrices cannot added");
	return R;
	}


	
     
}
