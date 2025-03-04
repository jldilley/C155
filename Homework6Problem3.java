/*Name: Joshua Dilley
Date: 03/03/2025
Assignment: Homework 6 Problem 3
Source Code: Homework6Problem3.java
Class: Online Section 35101
Action: Input two strings, combine them. Convert the combined string to upper case
and count the upper case letters in the original combined string. Place your strings
in double quotes.

 */
package testlab;

import java.util.*;

public class Homework6Problem3 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        String String1, String2, CombinedString, StringUpperCase;
        int UpperCase = 0, i = 0;
        char Ch;
        
        System.out.print("Please enter 1st string--> ");
        String1 = Input.nextLine();
        System.out.print("Please enter 2nd string--> ");
        String2 = Input.nextLine();
        System.out.println(" ");
        CombinedString = String1 + ' ' + String2;
        StringUpperCase = CombinedString;
        
        System.out.print("String one --> ");
        System.out.print('"'); 
        System.out.print(String1);
        System.out.print('"' + ","); System.out.print(" Length = ");
        System.out.print(String1.length()+"\n");
        
        System.out.print("String two --> ");
        System.out.print('"');
        System.out.print(String2);
        System.out.print('"' + ","); System.out.print(" Length = ");
        System.out.print(String2.length()+"\n");
        
        System.out.print("String combined --> ");
        System.out.print('"');
        System.out.print(CombinedString);
        System.out.print('"' + ","); System.out.print(" Length = ");
        System.out.print(CombinedString.length()+"\n");
        System.out.println(" ");
        
        StringUpperCase = StringUpperCase.toUpperCase();
        
        System.out.print("String UpperCase --> ");
        System.out.print('"');
        System.out.print(StringUpperCase);
        System.out.print('"');
        System.out.println(" ");
        
        do
        {
           Ch = CombinedString.charAt(i);
           
           if(Ch >= 'A' && Ch <='Z')
               UpperCase++;
           
           i++;
                       
        }while(i < CombinedString.length());
        
        System.out.print("The final string has ");System.out.print(UpperCase);
        System.out.println(" upper case letters.");                
    }
    
}
/* *************************Program Output**********************************
Please enter 1st string--> Hello
Please enter 2nd string--> my name is Josh.
 
String one --> "Hello", Length = 5
String two --> "my name is Josh.", Length = 16
String combined --> "Hello my name is Josh.", Length = 22
 
String UpperCase --> "HELLO MY NAME IS JOSH." 
The final string has 2 upper case letters.

Please enter 1st string--> This
Please enter 2nd string--> is Fun!
 
String one --> "This", Length = 4
String two --> "is Fun!", Length = 7
String combined --> "This is Fun!", Length = 12
 
String UpperCase --> "THIS IS FUN!" 
The final string has 2 upper case letters.

Please enter 1st string--> oops, 
Please enter 2nd string--> i forgot any capital letters.
 
String one --> "oops, ", Length = 6
String two --> "i forgot any capital letters.", Length = 29
String combined --> "oops,  i forgot any capital letters.", Length = 36
 
String UpperCase --> "OOPS,  I FORGOT ANY CAPITAL LETTERS." 
The final string has 0 upper case letters.
*/