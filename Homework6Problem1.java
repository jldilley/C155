/*Name: Joshua Dilley   
Date: 03/03/2025
Assignment: Homework 6 Problem 1
Source Code: Homework6Problem1.java
Class: Online Section 35101
Action: Write a for loop that shows how much the value a penny is after you 
double it over 30 days.
Note: Who knew it was this easy to get rich?

 */
package testlab;

public class Homework6Problem1 
{
    public static void main(String[] args) 
    {
        double Amount = 0.01;        
        
        System.out.print("Day");System.out.print("      ");
        System.out.println("Amount");
        System.out.println("----------------");
        
        for (int Day = 1; Day <=30; ++Day)
        {
            Amount = 2*Amount;
            System.out.printf("%-3d", Day);System.out.print("      ");
            System.out.print("$"); System.out.printf("%,f", Amount);
            System.out.println(" ");
        }
    }
}

/* **************************Program Output*********************************
Day      Amount
----------------
1        $0.020000 
2        $0.040000 
3        $0.080000 
4        $0.160000 
5        $0.320000 
6        $0.640000 
7        $1.280000 
8        $2.560000 
9        $5.120000 
10       $10.240000 
11       $20.480000 
12       $40.960000 
13       $81.920000 
14       $163.840000 
15       $327.680000 
16       $655.360000 
17       $1,310.720000 
18       $2,621.440000 
19       $5,242.880000 
20       $10,485.760000 
21       $20,971.520000 
22       $41,943.040000 
23       $83,886.080000 
24       $167,772.160000 
25       $335,544.320000 
26       $671,088.640000 
27       $1,342,177.280000 
28       $2,684,354.560000 
29       $5,368,709.120000 
30       $10,737,418.240000 
*/