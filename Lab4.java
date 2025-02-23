/*  Name: Joshua Dilley     
Date: 02/15/2025    
Assignment: Lab 4
Source Code: LAB4.java  
Class: Online Section: 35101
Action  : Program will display a menu and have user enter a choice,
             will continue to loop or repeat until user decides to quit.
             Menu choices are as follows:

             First choice:
               Program ask user to enter Fahrenheit temperature then
               calculates and displays the Celsius equavilent temperature.

             Second choice:
               Program ask user to enter radius of a circle then displays
               the area of circle.

             Third choice:
               Program ask user to enter any character from the keyboard
               and then tells whether entered key is a lower case letter,
               an upper case letter or no letter at all.

             Final choice:
               Program will quit when user enters a 'Q' or 'q'.


  ** NOTES **
      You need to fill in the missing code to get the program to work as
      described above.

      Do not change any of the code with the do-while loop, and do not
      change any of the existing code, just add what you need to get it to
      work.  You may add more variables if you want to.

      Also note that this program will not compile the way it is now,
      you must add the correct code first, then compile it.

----------------------------------------------------------------------*/
package testlab;

import java.util.*;

public class Lab4 
{
  public static void main(String[] args) 
   {
     final float PI = 3.14f;
     float Fahrenheit, Radius, Celsius, Area;
     char Response, Ch = 0;
     Scanner Input = new Scanner(System.in);

     do
      {
        System.out.print("\nChoose one of the following:\n");
        System.out.println("  1) convert Fahrenheit to Celsius");
        System.out.println("  2) calculate area of a circle");
        System.out.println("  3) Enter a character to see if upper or lower case or other");
        System.out.println("  Q) Quit");
        System.out.print("Response --> ");
        Response = Input.next().charAt(0);

        if (Response == '1')
         {
            System.out.print("Please enter the temperature in Fahrenheit--> "); 
            Fahrenheit = Input.nextFloat();
            Celsius = (float)((5.0/9.0) * (Fahrenheit - 32.0));
            System.out.println("\nThe temperature in Celcius is ");
            System.out.printf("%.2f %n", + Celsius);  
         }
        else if (Response == '2')
         {
             System.out.print("Please enter the radius of the circle--> ");
             Radius = Input.nextFloat();
             Area = (float)(PI * Radius * Radius);
             System.out.println("\nThe Area of the circle is ");
             System.out.printf("%.2f %n",+ Area);
         }
        else if (Response == '3')
         {
             System.out.print("Please enter a letter--> ");
             Ch = Input.next().charAt(0);
             if (Ch >= 'A' && Ch <='Z')
                 System.out.println("\nLetter is upper case.");
             else if (Ch >= 'a' && Ch <= 'z')
                 System.out.println("\nLetter is lower case.");
             else
                 System.out.println("\nCharacter is not a letter.");
          }

        else if (Response != 'Q' && Response != 'q')  // DO NOT change any code in these
              System.out.println("ILLEGAL INPUT, pick again\n\n");  //two lines or below
     }
    while (Response != 'Q' && Response != 'q');
   }
}
/* ************************Program Output***********************************
Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> /
ILLEGAL INPUT, pick again

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> 1
Please enter the temperature in Fahrenheit--> 32

The temperature in Celcius is 
0.00 

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> 2
Please enter the radius of the circle--> 3.14

The Area of the circle is 
30.96 

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> 3
Please enter a letter--> A

Letter is upper case.

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> 3
Please enter a letter--> z

Letter is lower case.

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> 3
Please enter a letter--> ?

Character is not a letter.

Choose one of the following:
  1) convert Fahrenheit to Celsius
  2) calculate area of a circle
  3) Enter a character to see if upper or lower case or other
  Q) Quit
Response --> q
BUILD SUCCESSFUL (total time: 1 minute 20 seconds)
*/