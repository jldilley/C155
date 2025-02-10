/*Name: Joshua Dilley   
Date: 02/09/2025    
Assignment: Homework 3 Problem 1
Source Code: Homework3Problem1.java
Class: Online Section 35101
Action: User enters two integers. Both integers are displayed, but the largest
one is displayed first. 

 */
package testlab;

import java.util.Scanner;

public class Homework3Problem1 {
    
    public static void main(String[] args) 
    {   
        Scanner Input = new Scanner(System.in);
        int FirstNumber, SecondNumber;
        
        System.out.print("Please enter a number--> ");
        FirstNumber = Input.nextInt();
        System.out.print("Please enter a second number--> ");
        SecondNumber = Input.nextInt();
        
        if(FirstNumber >= SecondNumber)
            System.out.println("The numbers you entered are: " + FirstNumber + " and " + SecondNumber);
        else
            System.out.println("The numbers you entered are: " + SecondNumber + " and " + FirstNumber);
    }
}
/* *****************************Program Output*********************************
Please enter a number--> 645
Please enter a second number--> 16
The numbers you entered are: 645 and 16

Please enter a number--> 20
Please enter a second number--> 465
The numbers you entered are: 465 and 20

Please enter a number--> 0
Please enter a second number--> 0
The numbers you entered are: 0 and 0

Please enter a number--> -86
Please enter a second number--> -230
The numbers you entered are: -86 and -230

Please enter a number--> -100
Please enter a second number--> -56
The numbers you entered are: -56 and -100

Please enter a number--> -10
Please enter a second number--> -10
The numbers you entered are: -10 and -10
*/
