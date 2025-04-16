/*Name: Joshua Dilley
Date: 04/13/2025
Assignment: Homework 10 Problem 2
Source Code: Homework10Problem2.java
Class: Online Section 35101
Action: User enters a base number and exponent to find the base number raised 
to a power. The calculation is executed in a function. The answer is then returned
to the main. Program assumes natural numbers only. 

*/
package testlab;
import java.util.*;
public class Homework10Problem2 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Base = 0, Exponent = 0;
        
        System.out.print("Please input the base: ");
        Base = Input.nextInt();
        System.out.print("Please input the exponent: ");
        Exponent = Input.nextInt();
        
        System.out.println("Answer is = " + IntegerPower(Base, Exponent));
    }
/* ************************IntegerPower****************************************
    Action: calculates the base number raised to a power
    Parameters: B, holds Base from the main; X, holds Exponent from the main
    Return: returns Answer to the main
    Precondtions: the function only accepts positive integers
-----------------------------------------------------------------------------*/
    static int IntegerPower(int B, int X)
    {
        int Answer = 1;
        for(int i = 0; i < X; ++i)
            Answer = Answer * B;
        return Answer;
    }        
}

/* ***************************Program Output***********************************
Please input the base: 2
Please input the exponent: 5
Answer is = 32

Please input the base: 3
Please input the exponent: 4
Answer is = 81

Please input the base: 5
Please input the exponent: 6
Answer is = 15625

Please input the base: 1
Please input the exponent: 1
Answer is = 1
*/
