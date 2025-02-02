/*Name: Joshua Dilley
Date: 02/02/2025    
Assignment: Program 6
Source Code: Program6.java
Class: Online Section 35101
Action: This program uses Boolean logic to determine which integer, out of two 
entered, is the largest. 
 */
package testlab;

import java.util.*;

public class Program6 
{
    public static void main(String[] args) 
    { //Set up
        Scanner Input = new Scanner(System.in);
        int First = 0, Second = 0;
      //Data collection
        System.out.println("Enter two integers:");
        System.out.print("First integer==> ");
        First = Input.nextInt();
        System.out.print("Second integer==> ");
        Second = Input.nextInt();
      //Results
        if(First>Second)
            System.out.println(First + " is the largest.");
        else if(Second>First)
            System.out.println(Second + " is the largest.");
        else
            System.out.println("The numbers are equal.");
    }
    
}
/* **************Program Output*****************
Enter two integers:
First integer==> 5
Second integer==> 3
5 is the largest.
*/