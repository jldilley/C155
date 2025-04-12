/*Name: Joshua Dilley
Date: 04/09/2025
Assignment: Homework 9
Source Code: Homework9.java
Class: Online Section 35101
Action: User enters a string. The string is read into a function and converted to 
an integer. The function trims white spaces, then tests for a leading digit. If 
the leading character is not a digit, an error message is returned. The
function reads the string until a non-numeric character is found. If the 
converted integer is over 65,535, then an error message is returned. 
If no errors, the integer is returned to the main and displayed. The main loops
until user enters an 'N' to quit out.
Notes: Professor Holloway helped me complete the prorgram, specifically 
understanding the logic behind the code in my function's while loop. He also taught me
about the importance of order in my logic statements. 
 */
package testlab;
import java.util.*;
public class Homework9 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        String Str;
        char Ch = 0;
        
        do
        {
            System.out.print("\nPlease enter a numeric string: ");
            Str = Input.nextLine();
            
            switch(ReadInt(Str))
            {
                case-1:System.out.println("Illegal entry. Initial character not a digit.");break;
                case-2:System.out.println("Overflow error. Larger than 65535.");break;
                default:System.out.println(ReadInt(Str));break;
            }    
            
            System.out.print("\nWould you like to continue with another string? ");
            System.out.print(" N for no. Any other key to continue. ");
            Ch = Input.next().charAt(0);
            Input.nextLine();//it took me forever to remember this. I had to look it up. 
            
        }while(!(Character.toUpperCase(Ch) == 'N'));
    }
/* *****************************ReadInt****************************************
Action: accepts string from the main to convert to an integer
Paramters: N, holds string from the main
Return: returns the converted integer to the main to be displayed, otherwise
        it will return an error message.
Preconditions: only accepts a string     
-----------------------------------------------------------------------------*/ 
    static int ReadInt(String S)
    {
       
        int Number = 0, i = 0, Ch = 0;
        
        S = S.trim();//set the string to the trimmed version of the original string
        
        if(!(Character.isDigit(S.charAt(0))))
            return -1;
        
        while(i < S.length() && Character.isDigit(S.charAt(i)))
        {    
            Ch = (S.charAt(i) - '0'); //convert charcter to integer
            Number = Number * 10;
            Number = Number + Ch;
            ++i;
        }    
            
        if(Number > 65535)
            return -2;
        else
            return Number;            
    }        
}
/* ***************************Program Output**********************************
Please enter a numeric string: 9654
9654

Would you like to continue with another string?  N for no. Any other key to continue. i

Please enter a numeric string: 43213164
Overflow error. Larger than 65535.

Would you like to continue with another string?  N for no. Any other key to continue. ]

Please enter a numeric string: 54.134154654613.31361
54

Would you like to continue with another string?  N for no. Any other key to continue. y

Please enter a numeric string: I like Programming
Illegal entry. Initial character is not a digit.

Would you like to continue with another string?  N for no. Any other key to continue. y

Please enter a numeric string: 0
0

Would you like to continue with another string?  N for no. Any other key to continue. n
BUILD SUCCESSFUL (total time: 50 seconds)
*/