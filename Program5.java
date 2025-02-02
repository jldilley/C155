/*Name: Joshua Dilley
Date: 02/02/2025
Assignment: Program5
Source Code: Program5.java
Class: Online Section 35101
Action: Calculate and display dollars and cents given a certain amout of change.
 */
package testlab;

import java.util.Scanner;

public class Program5 
{
    public static void main(String[] args)
    {//Set up
        Scanner Input = new Scanner(System.in);
        int Quarters, Dimes, Nickels, Pennies, TotalValue, Dollar, Cents;
        final int PENNIES_IN_DOLLAR  = 100; 
    //Data collection
        System.out.print("Please enter the number of quarters--> ");
        Quarters = Input.nextInt();
        System.out.print("Please enter the number if dimes--> ");
        Dimes = Input.nextInt();
        System.out.print("Please enter the number of nickels--> ");
        Nickels = Input.nextInt();
        System.out.print("Please enter the number of pennies--> ");
        Pennies = Input.nextInt();
    //Calculations
        TotalValue = (25*Quarters) + (10*Dimes) + (5*Nickels) + Pennies;
        Dollar = TotalValue/PENNIES_IN_DOLLAR;
        Cents = TotalValue%PENNIES_IN_DOLLAR;
    //Results
        System.out.println("You have " + Dollar + " dollar(s), and " + Cents + " cent(s)");
        }
    
}
/* **************************Program Output****************************
Please enter the number of nickels--> 20
Please enter the number of pennies--> 1
You have 1 dollar(s), and 1 cent(s)

Please enter the number of nickels--> 58
Please enter the number of pennies--> 125
You have 4 dollar(s), and 15 cent(s)
*/