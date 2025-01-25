/*Name: Joshua Dilley
Date: 01/25/25
Source Code: VolumeAndSurfaceAreaOfSohere.java

 */
package testlab;

import java.util.Scanner;

public class VolumeAndSurfaceAreaOfSphere 
{
    public static void main(String[] args) 
    {   
        final float PI = 3.1415f;
        
        float Radius;
        
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Please enter the radius of the sphere in question ==>");
        
        Radius = Input.nextFloat();
        
        System.out.println("The volume of a sphere with " + Radius + " is " + 4/3*PI*Radius*Radius*Radius + "\n");
        
        System.out.println("The surface area of a sphere with " + Radius + " is " + 4*PI*Radius*Radius + "\n");
        
         }
    
}
/* ***************** Program Output***************************
Please enter the radius of the sphere in question ==>
23
The volume of a sphere with 23.0 is 38222.633

The surface area of a sphere with 23.0 is 6647.414

*/