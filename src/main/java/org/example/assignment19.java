/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask for weight and height
        System.out.println("Enter weight in pounds");
        double weight = scan.nextDouble();

        System.out.println("Enter height in inches");
        double height = scan.nextDouble();

        //calculate math
        double bmi =(weight / (height * height)) * 703;

        //output message
        System.out.println("Your BMI is " + String.format("%.1f", bmi));

        if(bmi > 25) {
            System.out.println("You are overweight according to your BMI");
        } else if(bmi < 18.5) {
            System.out.println("You are underweight according to your BMI");
        } else {
            System.out.println("You are within the ideal weight range according to BMI");
        }
    }
}
