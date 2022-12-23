package com.csmtech;

 import java.util.Scanner;

public class Airline 
{
    boolean[] seating = new boolean[11];
    Scanner input = new Scanner(System.in);

    public void start()
    {       
        while ( true )
        {
            makeReservation();
        }   
    }

    public void makeReservation()
    {
        System.out.println("Please type 1 for First Class or 2 for Economy: ");
        int section = input.nextInt();
        if ( section == 1 )
        {
            firstClassSeat();
        }
        else
        {
            economySeat();
        }
    }

    public void firstClassSeat()
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  
            {
                seating[count] = true;  
                System.out.printf("First Class. Seat# %d\n", count);
                break;
            }
            else if ( seating[5] == true ) 
            {
                if ( seating[10] == true)
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                }
                else
                {
                    System.out.println("First Class is fully booked. Would you like Economy? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        economySeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours.");
                        System.exit(0);
                    }
                }
            }
        }
    }   

    public void economySeat() 
    {
        for ( int count = 6; count <= 10; count++ )
        {
            if ( seating[count] == false ) 
            {
                seating[count] = true;
                System.out.printf("Economy. Seat# %d\n", count);
                break;
            }
            else if ( seating[10] == true ) 
            {
                if ( seating[5] == true)
                {
                    System.out.println("Sorry, flight fully booked. Next flight is in 3 hours.");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Economy is fully booked. Would you like First Class? 1 for Yes 2 for No");
                    int choice = input.nextInt();
                    if ( choice == 1 )
                    {
                        firstClassSeat();
                        start();
                    }
                    else
                    {
                        System.out.println("Next flight is in 3 hours");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
	