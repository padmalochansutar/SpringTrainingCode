import java.util.Scanner;
public class Semiconductor {
	public static void main(String[] args) {
		int ind=8;
		int gov=16;
		int uni=32;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a microprocessor:");
		int mi=scn.nextInt();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the type of customer:");
	    char ch=input.next().charAt(0);
		System.out.println("Enter the amount order");
	      double amount=scn.nextDouble();
	      if(mi==ind||mi==gov&&mi==uni) {}
	      else if(amount<50000) {
	    	  double ic=50000*5/100;
	    	  double ga=50000*6.5/100;
	    	  System.out.println(ic+" "+ga);
	    	 }
	      else if(amount>=50000) {
	    	  double ic=50000*7.5/100;
	    	  double ga=50000*8.5/100;
	    	  System.out.println(ic+" "+ga);
	      }
	      else if(amount>100000) {
	    	  double ic=100000*10/100;
	    	  double ga=100000*10/100;
	    	  System.out.println(ic+" "+ga);
	    	 }
	      else {
	    	  double uni=amount*7.5/100;
	    	  System.out.println("universities:"+uni);
	      }
	      
	      

}
}
		
		
		
	
	


