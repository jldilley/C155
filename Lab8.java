/*Name:Joshua Dilley    
Date: 03/26/2025
Assignment: Lab 8
Source Code: Lab8.java
Class: Online Section 35101
Action: User enters string of characters. A function then determines and 
displays the number of vowels, spaces, and lower case letters.
Notes: I noticed that you didn't include 'Y' among the vowels, so I left her out.
Build Time: 2:30
 */
package testlab;

import java.util.*;

public class Lab8 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        String Str;
        
        System.out.print("\nPlease enter a sentence: \n");
        Str = Input.nextLine();
        
        DisplayVowelsSpacesLowerCase(Str);
    }
    
/* *************DisplayVowelsSpacesLowerCase(String X)*************************
Action: counts and displays the number of vowels, spaces, and lower case 
        characters.
Parameters: X, holds the string from the main
Returns: doesn't return anything to the main. Displays from the function.
Preconditions: needs to be a string.     
*/
    static void DisplayVowelsSpacesLowerCase(String X)
    {
       int Vowels = 0, Spaces = 0, LowerCase = 0;
       char Ch = 0;
       
        while (Ch < X.length())                     
        {   
                if (Character.isWhitespace(X.charAt(Ch)))
                    ++Spaces;
                
                    else if (Character.isLowerCase(X.charAt(Ch)))
                        ++LowerCase;
                
                if(X.charAt(Ch) == 'a' || X.charAt(Ch) == 'A')
                    ++Vowels;
                
                    else if(X.charAt(Ch) == 'e' || X.charAt(Ch) == 'E')
                        ++Vowels;
                        
                    else if(X.charAt(Ch) == 'i' || X.charAt(Ch) == 'I')  
                        ++Vowels;
                    
                    else if(X.charAt(Ch) == 'o' || X.charAt(Ch) == 'O')
                        ++Vowels;
                    
                    else if(X.charAt(Ch) == 'u' || X.charAt(Ch) == 'U')
                        ++Vowels;
                
                Ch++;
        }
        
        System.out.print("\nVowels = " + Vowels +"\n");
        System.out.print("Spaces = " + Spaces + "\n"); 
        System.out.print("Lower case = " + LowerCase + "\n");
    }   
}
/* ***********************Program Output**************************************
Please enter a sentence: 
This is a lovely Day

Vowels = 6
Spaces = 4
Lower case = 14

Please enter a sentence: 
oDay ouYay eakSpay igPay atinLay?

Vowels = 13
Spaces = 4
Lower case = 23

*/