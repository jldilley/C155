/*Name: Joshua Dilley   
Date: 03/03/2025
Assignment: Homework 6 Problem 2
Source Code: Homework6Problem2.java
Class: Online Section 35101
Action: User enters two intergers and an operand. The program then uses a switch
loop in order to deteremine which operation to use. The program will display the 
formula along with the answer. User enters an 'N' to leave the program.
Note: The program prompted me to "convert to rule switch". When I clicked on it
Java modified my switch! It functions in the same way, but it removed the colons 
and the break command. I hope this is ok. It does look a bit cleaner, too.
 */
package testlab;

import java.util.*;

public class Homework6Problem2 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int Number1, Number2;
        char Operand, Option;
        
        System.out.print("Please enter two integers. First integer--> ");
        Number1 = Input.nextInt();
        System.out.print("Second integer--> ");
        Number2 = Input.nextInt();
        System.out.print("What operation would you like to perform? ");
        System.out.println("+ for addition, - for subtraction, * for multiplication, / for division, or % for remainder.");
        Operand = Input.next().charAt(0);
        
        do
        {
            switch (Operand)
            {
                case '+' -> System.out.print(Number1 + " + " + Number2 + " = " + (Number1 + Number2 ) + "\n");
                case '-' -> System.out.print(Number1 + " - " + Number2 + " = " + (Number1 - Number2 ) + "\n");
                case '*' -> System.out.print(Number1 + " x " + Number2 + " = " + (Number1 * Number2 ) + "\n");
                case '/' -> System.out.print(Number1 + " / " + Number2 + " = " + (Number1 / Number2 ) + "\n");
                case '%' -> System.out.print(Number1 + " % " + Number2 + " = " + (Number1 % Number2 ) + "\n");
                default -> System.out.println("Input not recognized. Please try again.");
            }
            
            System.out.print("Press N to leave program. Press any other key to continue. ");//found it
            Option = Input.next().charAt(0);
            
            if(!(Option == 'N' || Option == 'n'))
            {
                System.out.print("Please enter two integers. First integer--> ");    
                Number1 = Input.nextInt();
                System.out.print("Second integer--> ");
                Number2 = Input.nextInt();
                System.out.print("What operation would you like to perform? ");
                System.out.println("+ for addition, - for subtraction, * for multiplication, / for division, or % for remainder.");
                Operand = Input.next().charAt(0);
            }
              
        }while(!(Option == 'N' || Option =='n'));
    }
}
/* **********************Program Output************************************
Please enter two integers. First integer--> 6
Second integer--> 9
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
+
6 + 9 = 15
Press N to leave program. Press any other key to continue. y
Please enter two integers. First integer--> 6
Second integer--> 9
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
-
6 - 9 = -3
Press N to leave program. Press any other key to continue. y
Please enter two integers. First integer--> 6
Second integer--> 9
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
*
6 x 9 = 54
Press N to leave program. Press any other key to continue. y
Please enter two integers. First integer--> 9
Second integer--> 3
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
/
9 / 3 = 3
Press N to leave program. Press any other key to continue. 9
Please enter two integers. First integer--> 11
Second integer--> 5
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
%
11 % 5 = 1
Press N to leave program. Press any other key to continue. n

Please enter two integers. First integer--> 1
Second integer--> 1
What operation would you like to perform? + for addition, - for subtraction, * for multiplication, / for division, or % for remainder.
t
Input not recognized. Please try again.
Press N to leave program. Press any other key to continue. N
*/