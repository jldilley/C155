/*Name: Joshua Dilley
Date: 02/18/2025    
Assignment: Homework 4 Problem 2
Source Code: Homework4Problem2.java
Class: Online Secion 35101
Action: Calculate a person's blood alcohol content and display possible 
symptoms.
Note: I'll probably lose points on the algorithm, but I think I'll be better 
served in the long run if I get used to writing the algorithm on paper. I've 
found that in writing the algorithm, I want to go back and change things as I 
work through it. Then, as the logic gets tested in the code, I find that my 
algorithm may not work as written and needs further, messy revision. But I 
think I'll improve in writing as I go. 
 */
package testlab;

import java.util.Scanner;

public class Homework4Problem2 
{
    public static void main(String[] args)
    { 
        Scanner Input = new Scanner(System.in);
        final double MALE = 0.68d;
        final double FEMALE = 0.55d;
        char Gender;
        double MetabolismRate, BAC = 0; 
        int NumberDrinks, BodyWeight, BodyWeightGrams, HoursDrinking, GramsAlcohol;
        
        System.out.print("\nPlease enter hours drinking--> ");
        HoursDrinking = Input.nextInt();
        MetabolismRate = HoursDrinking * 0.015;
        System.out.print("\nPlease enter the person's body weight in pounds--> ");
        BodyWeight = Input.nextInt();
        BodyWeightGrams = BodyWeight * 454;
        System.out.print("\nPlease enter the number of drinks consumed--> ");
        NumberDrinks = Input.nextInt();
        GramsAlcohol = NumberDrinks * 14;
        
        System.out.print("\nEnter the person's gender. M for male. F for female.--> ");
        Gender = Input.next().charAt(0);
        
        if(Gender == 77)
            BAC = ((GramsAlcohol/(BodyWeightGrams*MALE))*100) - MetabolismRate;
        else if(Gender == 70)
            BAC = ((GramsAlcohol/(BodyWeightGrams*FEMALE))*100) - MetabolismRate;
        
        System.out.print("\nThe person's BAC is--> ");System.out.printf("%.3f %n", + BAC);
        
        if(BAC > 0 && BAC <= 0.05)
            System.out.print("\nFeeling good.\n");
        else if(BAC > 0.05 && BAC <= 0.200)
            System.out.print("\nSlurring speech, loss of balance\n.");
        else if(BAC > 0.200 && BAC <= 0.249)
            System.out.print("\nNeed assistance in walking; total mental confusion\n."); // or maybe just a comp sci major
        else if(BAC >= 0.250 && BAC <= 0.399)
            System.out.print("\nAlcohol poisoning. Loss of consciousness\n.");
        else if(BAC >= 0.40)
            System.out.print("\nOnset of coma, possible death due to respiratory arrest\n.");
        else    
            System.out.print("\nYou are just fine\n.");
    }
    
}
/* *************************Program Output***********************************
Please enter hours drinking--> 3

Please enter the person's body weight in pounds--> 165

Please enter the number of drinks consumed--> 2

Enter the person's gender. M for male. F for female.--> M

The person's BAC is--> 0.010 

Feeling good.

Please enter hours drinking--> 2

Please enter the person's body weight in pounds--> 120

Please enter the number of drinks consumed--> 8

Enter the person's gender. M for male. F for female.--> F

The person's BAC is--> 0.344 

Alcohol poisoning. Loss of consciousness

Please enter hours drinking--> 3

Please enter the person's body weight in pounds--> 210

Please enter the number of drinks consumed--> 6

Enter the person's gender. M for male. F for female.--> M

The person's BAC is--> 0.085 

Slurring speech, loss of balance
*/
