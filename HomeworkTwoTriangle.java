/*Name: Joshua Dilley
Date: 01/31/2025
Assignment: Homework Number Two Problem 1
Source Code: HomeworkTwoTriangles.java
Class: Online Section 35101
Action: Enter two angles of a triangle. Calculate and display the value of the thrid angle. 
Notes: I was helped to complete this assignment by Patrick Ryan during tutoring hours. 
*/
package testlab;

import java.util.Scanner;

public class HomeworkTwoTriangle 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double Angle1, Angle2, Angle3;
        
        System.out.print("Please enter the first angle-> ");
        Angle1 = Input.nextDouble();
        System.out.print("Please enter the second angle-> ");
        Angle2 = Input.nextDouble();
        
        Angle3 = (180 - (Angle1+Angle2));
        
        System.out.println("The third angle of your triangle is " + Angle3);
        }
    
}
/* **************Program Output****************
Please enter the first angle-> 100
Please enter the second angle-> 50
The third angle of your triangle is 30.0
*/