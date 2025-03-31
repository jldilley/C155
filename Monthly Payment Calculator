/*Name: Joshua Dilley
Date: 03/30/2025
Assignment: Program 8
Source Code: HomeworkEight.java
Class: Online Section 35101
Action: The program accepts information from the user then calls two functions
in order to calculate and display loan infomation. 

 */
package testlab;

import java.util.*;

public class HomeworkEight 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        float Principal = 0, AnnualInterestRate = 0;
        int Years = 0, PaymentsPerYear = 0;
        char Ch;
        
        do
        {
            System.out.print("\nPlease enter the loan principal: ");
            Principal = Input.nextFloat();
            System.out.print("Please enter the annual interest rate of the loan: ");
            AnnualInterestRate = Input.nextFloat();
            System.out.print("For how many years will you carry the loan? ");
            Years = Input.nextInt();
            System.out.print("How many payments will you make per year? ");
            PaymentsPerYear = Input.nextInt();
            
            Show_Table(Principal, AnnualInterestRate, Years, PaymentsPerYear);
            
            System.out.print("\nCalculate another loan payment? ");
            System.out.print("N to quit program. Any other key to continue. ");
            Ch = Input.next().charAt(0);
            
        }while(!((Ch == 'N') || (Ch == 'n'))); 
    }
/* *************************Show_Table****************************************
Action: Organizes information from the main and calls a function to calculate
the monthly payment of the loan. 
Parameters: P, holds Principal from the main; A, holds AnnualInterestRate from
the main; Y, holds Years from the main; T, holds PaymentPerLoan from the main.
Return: doesn't return anything, but displays loan table
Preconditions: floats or integers    
-----------------------------------------------------------------------------*/    
    
    static void Show_Table(float P, float A, int Y, int T)
    {
        System.out.print("\nPrincipal");System.out.print("            $");
        System.out.printf("%.2f", P);System.out.println("");
        System.out.print("Interest Rate        ");System.out.printf("%.2f", A);
        System.out.print("%");System.out.println("");
        System.out.print("No. of Years         ");System.out.println(Y);
        System.out.print("Payments Per Year    ");System.out.println(T);
        System.out.print("No. of Payments      ");System.out.print(Y * T);
        System.out.println("");
        System.out.print("Monthly Payment");System.out.print("      $");
        System.out.printf("%.2f", MonthlyPayment(P, A, Y, T));
    }   
/* ***************************MonthlyPayment**********************************
Action: calculates the monthly payment given the information the user enters
Parameters: Pr, holds P from Show_Table; An, holds A from Show_Table; Yr, holds
Y from Show_Table; Trm, holds T from Show_Table.
Return: returns MonthlyPayment to the function Show_Table.
Preconditions: floats or integers.    
-----------------------------------------------------------------------------*/    
    
    static float MonthlyPayment(float Pr, float An, int Yr, int Trm)
    {
        float Interest_Rate = 0, FormulaA = 0, Divisor = 0, Quotient = 0;
        float MonthlyPayment;
        double FormulaB;
        int Term = 0, TermExponent = 0;
        
        An = An/100;
        Interest_Rate = An/12; 
        Term = Yr * Trm;  
        FormulaA = Interest_Rate + 1; 
        TermExponent = Term * (-1); 
        FormulaB = (Math.pow(FormulaA,TermExponent));
        Divisor = 1 - (float)FormulaB;
        Quotient = Interest_Rate/Divisor; 
        MonthlyPayment = Pr * Quotient;
        return MonthlyPayment;
    }
}
/* **************************Program Output***********************************
Please enter the loan principal: 11000
Please enter the annual interest rate of the loan: 10
For how many years will you carry the loan? 4
How many payments will you make per year? 12

Principal            $11000.00
Interest Rate        10.00%
No. of Years         4
Payments Per Year    12
No. of Payments      48
Monthly Payment      $278.99
Calculate another loan payment? N to quit program. Any other key to continue. y

Please enter the loan principal: 15500
Please enter the annual interest rate of the loan: 5.70
For how many years will you carry the loan? 5
How many payments will you make per year? 12

Principal            $15500.00
Interest Rate        5.70%
No. of Years         5
Payments Per Year    12
No. of Payments      60
Monthly Payment      $297.50
Calculate another loan payment? N to quit program. Any other key to continue. y

Please enter the loan principal: 115000
Please enter the annual interest rate of the loan: 7.75
For how many years will you carry the loan? 30
How many payments will you make per year? 12

Principal            $115000.00
Interest Rate        7.75%
No. of Years         30
Payments Per Year    12
No. of Payments      360
Monthly Payment      $823.88
Calculate another loan payment? N to quit program. Any other key to continue. n
BUILD SUCCESSFUL (total time: 2 minutes 21 seconds)
*/
