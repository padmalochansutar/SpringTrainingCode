import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the no:");
		int i=scn.nextInt();
		int rem,sum=0;
		int n=1,t=0;
		while(i>0) {
			rem=i%10;
			sum=0;
			n=1;
			while(rem>0) {
				
				n=rem*n;
				sum=0;
				
				sum=n+sum;
				rem--;
				t=t+sum;
				System.out.println(+t);
				
			}
			
			
			i=i/10;
			
			}
		System.out.println(+sum);
		}
		
		
	}


