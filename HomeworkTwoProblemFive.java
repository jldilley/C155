/*Name: Joshua Dilley
Date: 2/1/2025
Assignment: Homework 2 Problem 5
Class: Online Section 35101
Action: Write an algorithm for a potential program that determines whether or
not a year is (or was) a leap year.
 */

/* ************************Three Step Analysis*****************************
1. Understand the problem: I need to write an algorithm for determening 
leap years.

2. Input                      Output                        Equations
   Year                       Leap year                     Year%400
                              Not a leap year               Year%4
                                                            Year%100
   input will be an integer

3. Limited to positive integers.

*****************************Algorithm**************************************

Scanner
int Year

sout ("Please enter a year->"
Read Year

if(Year>0)
   if (Year == mod 400) then
      write "Leap year."
    else if ((Year == mod 4) && (Year != mod 100))
      write "Leap year."
    else
      write "Not a leap year."
else
    write "Please try again with a positive intger"
*/
package testlab;

import java.util.Scanner;

public class HomeworkTwoProblemFive 
{
    
    public static void main(String[] args) 
    {//Set up
        Scanner Input = new Scanner(System.in);
        int Year;
       
    //Data collection
        System.out.print("Please enter a year-> ");
        Year = Input.nextInt();
        
    //Calculations
    
        if(Year>0)
            if(Year%400 == 0)
               System.out.println(Year + " is a leap year.");
            else if((Year%4 == 0) && (Year%100 != 0))
               System.out.println(Year + " is a leap year.");
            else
               System.out.println(Year + " is not a leap year.");
        else
            System.out.println("Please run again with a positive integer!");
    }
}
