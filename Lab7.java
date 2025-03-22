/*Name: Joshua Dilley
Date: 03/22/2025
Assignment: Lab 7
Source Code: Lab7.java
Class: Online Section 35101
Action: User enters two integers. Program subtracts second number from the first
number. The program then displays the answer and, depending on the value of the
answer, will display ASCII art of a plus sign or a minus sign. 
Note: Pronounced ASS KEY
Build Time: 1 hour
*/
package testlab;

import java.util.*;

public class Lab7 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Number1 = 0, Number2 = 0, Answer = 0;
        
        do
        {
            System.out.print("\nPlease enter two integers to subtract, "
                              + "same two to quit --> ");
            Number1 = Input.nextInt(); 
            Number2 = Input.nextInt();
            
            Answer = Number1 - Number2;
            System.out.print("\nThe answer is " + Answer);
            System.out.print("\nAnd expression is: \n");
            
            DisplayExpression(Answer);
            
        }while (Answer != 0);
    }
    /* *********************DisplayExpression**********************************
    Action: Display ASCII art of a plus or minus sign depending on the value
    of Answer
    Parameters: no parameters
    Return: Not applicable
    */
    
    static void DisplayExpression(int A)
    {
        if( A >= 0)
        {
            System.out.print("\n    *     \n");
            System.out.print("    *     \n");
            System.out.print("*********\n");
            System.out.print("    *     \n");
            System.out.print("    *     \n");
        }
        else
            System.out.print("\n************\n");
    }
}
/* *********************Program Output***************************************
Please enter two integers to subtract, same two to quit --> 5 3

The answer is 2
And expression is: 

    *     
    *     
*********
    *     
    *     

Please enter two integers to subtract, same two to quit --> 3 5

The answer is -2
And expression is: 

************

Please enter two integers to subtract, same two to quit --> 0 0

The answer is 0
And expression is: 

    *     
    *     
*********
    *     
    *    
BUILD SUCCESSFUL (total time: 9 seconds)
*/