
/*import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;*/
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{2,5},{1,2},{2,6}};
		int[][] B= {{2,5,9},{6,1,2}};
		int[][] c=new int[3][3];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				c[i][j]=0;
				for(int k=0;k<A.length;k++) {
					c[i][j]=A[i][k]*B[k][j];
				}
				System.out.println(c[i][j]+"");
			}
			System.out.println();
		}
		
				
				
			
		}
		
	}


			
		
		
	


