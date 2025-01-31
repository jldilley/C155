/* Name: Joshua Dilley
Date: 01/31/2025
Assignment: Lab 2
Source Code: Lab2.java
Class: Online Section 35101
Action: This program has some missing code. Need to fill in the missing 
parts to solve following problem.

This program will have the user enter a two digit number and then 
display the number in reverse. For example, if enter 47 will 
display 74.  This number displayed needs to be one variable and 
not two.

Notes: I completed this assignment with the help of Patrick Ryan during tutoring hours. He helped me to see how I could manipulate the 
digits occupying the ones and tens positions to get a number assigned to a single variable. I did notice that the program fails to reverse an 
input of 00 properly. It defaults to just 0. I'd be interested to know if there is a way to output 00 in this case. 
 */

package testlab;

import java.util.Scanner;

public class Lab2 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Num, First, Second, Reverse;
                 
        System.out.print("Enter two digit integer ");
        Num = Input.nextInt();
     
        Second = Num % 10; //assigns the second digit of our original input by using the remaider
        First = Num/10;// assigns the first number of our original input by using the quotient
        Reverse = (Second*10)+First;
        
        System.out.println("Reverse of your number is " + Reverse);
        }    
}
/* **********************Program Output*********************
Enter two digit integer 21
Reverse of your number is 12

Enter two digit integer 33
Reverse of your number is 33

Enter two digit integer 00
Reverse of your number is 0
*/
