/**
 * Purpose of this program: Using if-else-if condition statements to determine the weight status
 * using the calculated BMI.
 *
 * @author Trisha Ganesh
 * @version 2/07/2020
 */

import java.util.Scanner;

public class BMI
{
    public static void main (String[] args)
    {
        String Category = "";
        Scanner in = new Scanner(System.in);


        //User Input
        System.out.print("Please enter your name (first last):  ");
        String name = in.nextLine();

        System.out.print("Please enter your weight in pounds (e.g 75): ");
        double weight = in.nextDouble();

        System.out.print("Please enter your height in feet and inches (e.g. 5 0): ");
        double height = in.nextDouble();

        //calculate BMI
        double heightMeters = height * 0.3048;
        double weightKG = weight * 0.453592;
        double BMI = weightKG / Math.pow(heightMeters, 2);

        //Determine weight status
                if(BMI < 18.5)
        Category = "Underweight";
                else if(BMI >= 18.5 && BMI <= 24.9)
        Category = "Normal or Healthy Weight";
                else if(BMI >= 25.0 && BMI <= 29.9)
        Category = "Overweight";
                else
        Category = "Obese";

        //Print output
        System.out.println("\n");
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");

        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightMeters);
        System.out.println("Weight (kg): " + weightKG);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + Category);
    }
}