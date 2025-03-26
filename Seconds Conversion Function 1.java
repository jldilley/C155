/*Name: Joshua Dilley
Date: 03/23/2025
Assignment: Homework 7 Problem 1
Source Code: HomeworkSevenProblem1.java
Class: Online Section 35101
Action: User enters an integer. The program calls a function to calculate and
display hours, minutes, and seconds. User enters zero to leave the program.  
Build Time: 1.5 hours 
 */
package testlab;

import java.util.*;

public class HomeworkSevenProblem1 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Seconds = 0;
        
        do
        {
            System.out.print("\nPlease enter the number of seconds. "
                    + "Enter a zero to leave the program.--> ");
            Seconds = Input.nextInt();
            
            HoursMinutesSeconds(Seconds);
            
        }while(Seconds != 0);    
    }
/* ************************HoursMinutesSeconds********************************
Action: Calculates and displays the hours, minutes, and seconds of the number
entered in the main.
Parameters: X, holds the integer entered in the main
Return: nothing is returned, just displayed.    
*/    
    
    static void HoursMinutesSeconds(int X)
    {
        int Hours, Minutes, Seconds = 0;
        
        Hours = X / 3600;
        Seconds = X % 3600;
        Minutes = Seconds / 60;
        Seconds = Seconds % 60;
        
        System.out.print(Hours + ":");
        System.out.printf("%02d", Minutes);
        System.out.print(":");
        System.out.printf("%02d", Seconds);
        System.out.println(" ");
    }        
}
/* *************************Program Output***********************************
Please enter the number of seconds. Enter a zero to leave the program.--> 3605
1:00:05 

Please enter the number of seconds. Enter a zero to leave the program.--> 4000
1:06:40 

Please enter the number of seconds. Enter a zero to leave the program.--> 9813
2:43:33 

Please enter the number of seconds. Enter a zero to leave the program.--> 0
0:00:00 
BUILD SUCCESSFUL (total time: 10 seconds)

*/
