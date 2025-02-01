/*Name: Joshua Dilley
Date: 2/1/2025
Assignment: Homework 2 Problem 4
Class: Online Section 35101
Action: Enter an emplyee's current salary. Calculate and display the new 
salary, the new annual salary, and what is owed to the employee in arrears
for the last six months. 

 */
package testlab;

import java.util.Scanner;

public class HomeworkTwoProblemFour 
{
    public static void main(String[] args)
    {//set up
        Scanner Input = new Scanner(System.in);
        double Prev, Retro, Annual, Monthly;
        
     //Data Collection
        System.out.print("Please enter the employee's current salary-> ");
        Prev = Input.nextFloat();  
        
    // Calculations
        Retro = (Prev*0.076)/2.0;
        Annual = Prev*1.076;
        Monthly = (Prev*1.076)/12.0;
        
    // Results
        System.out.println("$" + Retro + " is owed in arrears for last six months.");
        System.out.println("$" + Annual + " is the employee's new annual salary.");
        System.out.println("$" + Monthly + " is the employee's new monthly salary.");
        }    
}
/* *********Program Output************
Please enter the employee's current salary-> 35000
$1330.0 is owed in arrears for last six months.
$37660.0 is the employee's new annual salary.
$3138.3333333333335 is the employee's new monthly salary.

Please enter the employee's current salary-> 46500
$1767.0 is owed in arrears for last six months.
$50034.0 is the employee's new annual salary.
$4169.5 is the employee's new monthly salary.

Please enter the employee's current salary-> 52450
$1993.1 is owed in arrears for last six months.
$56436.200000000004 is the employee's new annual salary.
$4703.016666666667 is the employee's new monthly salary.

*/