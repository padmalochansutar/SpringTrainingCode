package csm.comtech;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter the units:");
    	double a=scn.nextDouble();
    	ElectricBill e=new ElectricBill(a);
    	System.out.println(e.totalElectricity());
	}
    
}
