/*Name: Joshua Dilley
Date: 01/23/25
Program #: 2
Source Code: Program2.java
Class: Online Section 35101
Action: This was the second program given to us by Professor Holloway. It declares and initializes three variables and assigns them to the 
Average identifier. I learned how to declarre and initialize a set of variables that share a data type on the same line. I also learned that psvm and sout
are short cuts for the main and print line commands, respectively. 

 */
package testlab;


public class Program2 
{
    public static void main(String[] args) 
    {
        int First = 1, Second = 2, Third;
        
        float Average;
        
        Third = 2;
        
        Average = (First + Second + Third)/3.0f;
        
        System.out.println("\nThe average of " + First + ", " + Second + ", and " + Third + " is " + Average + "\n");
        
        
    }
    
}
/* ***************************Program Output***********************************
The average of 1, 2, and 2 is 1.6666666
*/