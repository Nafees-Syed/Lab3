/*
Write a program that calculates the Body Mass Index (BMI) of a person. The user should input the
weight in pounds and height in feet, and the program should output the weight converted to kilograms,
height converted to meters, the calculated BMI (BMI = Kg/(m2
)), and its classification as underweight,
normal, overweight or obese.
 */
package bmi;
import java.util.*;

public class BMI {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter your weight in pounds: ");
        double weight = kb.nextDouble();
        System.out.println("Weight: " + weight);
        
        System.out.println("Enter your height in feets: ");
        double height = kb.nextDouble();
        System.out.println("Height: " + height);
        
        double kg = weight * 0.45;
        double meter = height * 0.30;
        
        System.out.println("weight in KG: " + kg);
        System.out.println("height in M: " + meter);
        
        double bmi = kg / (meter * meter);
        
        if (bmi <= 18.5){
            System.out.println("Normal weight");
        }
        
        
    }
    
}
