/*Name: Joshua Dilley
Date: 02/09/2025
Assignment: Homework 3 Problem 2
Source Code: Homework3Problem2.java
Class: Online Section 35101
Action: A program that calculates if a given year is, was, or will be a
leap year. 

 */        
package testlab;

import java.util.Scanner;

public class Homework3Problem2 
{
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Year;
       
        System.out.print("Please enter a year-> ");
        Year = Input.nextInt();
        
        if(Year>=0)
            if(Year%400 == 0)
               System.out.println(Year + " is a leap year.");
            else if((Year%4 == 0) && (Year%100 != 0))
               System.out.println(Year + " is a leap year.");
            else
               System.out.println(Year + " is not a leap year.");
        else
            System.out.println("Input not recognized. Please try again.");
    }
}  
/* ****************************Program Output********************************
Please enter a year-> 1600
1600 is a leap year.

Please enter a year-> 1988
1988 is a leap year.

Please enter a year-> 0
0 is a leap year. // Interesting!

Please enter a year-> -1988
Input not recognized. Please try again.

Please enter a year-> 1986
1986 is not a leap year.

Please enter a year-> 2025
2025 is not a leap year.
*/