package csm.comtech;
import java.util.Scanner;
public class User {
     public static void main(String[] args) {
		Scanner  scn=new Scanner(System.in);
		System.out.println("Enter the height:");
		int a=scn.nextInt();
		System.out.println("Enter the width:");
		int b=scn.nextInt();
		Rectangle r=new Rectangle(a,b);
		System.out.println(r.Area());
		System.out.println(r.Perimeter());
		
	}
     
}
