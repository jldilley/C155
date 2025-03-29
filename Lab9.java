/*Name: Joshua Dilley
Date: 03/29/2025
Assignment: Lab 9
Source Code: Lab9.java
Class: Online Section 35101
Action: User enters three integers. Program determines the largest one and
displays.
Build time: 45 minutes
*/
package testlab;

import java.util.*;

public class Lab9 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Number1 = 0, Number2 = 0, Number3 = 0;
        char Ch;
        
        do
        {    
        System.out.print("Please enter three integers. ");
        Number1 = Input.nextInt(); 
        Number2 = Input.nextInt();
        Number3 = Input.nextInt();
        
        System.out.print(LargestOfThreeIntegers(Number1, Number2, Number3) + "\n");
        System.out.print("Continue program? n to quit. Any other key to continue--> ");
        Ch = Input.next().charAt(0);                             
        
        }while(!((Ch == 'N') || (Ch == 'n')));
    }
    
/* *************************LargestOfThreeIntegers****************************
Action: Determine the largest of three integers
Parameters: F, holds Number1; S, holds Number2; T, holds Number3
Returns: largest integer back to the main 
Preconditons: integer     
    
-----------------------------------------------------------------------------*/    
    
    static int LargestOfThreeIntegers(int F, int S, int T)
    {
        if(F > S && F > T)
            return F;
        
        else if(S > F && S > T)
            return S;
        
        else
            return T;
    }        
}

/* *********************************Program Output****************************
Please enter three integers. 3 2 1
3
Continue program? N to quit. Any other key to continue--> p
Please enter three integers. 2 3 1
3
Continue program? N to quit. Any other key to continue--> y
Please enter three integers. 1 2 3
3
Continue program? N to quit. Any other key to continue--> \
Please enter three integers. 2 1 3
3
Continue program? N to quit. Any other key to continue--> 9
Please enter three integers. 3 1 2
3
Continue program? N to quit. Any other key to continue--> /
Please enter three integers. 1 3 2
3
Continue program? N to quit. Any other key to continue--> n
BUILD SUCCESSFUL (total time: 1 minute 40 seconds)
*/
    
