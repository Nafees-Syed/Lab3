/*
Write a program that provides a menu with 5 options of conversion operations 
(eg. meters to feet, CAD to USD, Celsius to Fahrenheit, ...). Based on the user
selection, the program should proceed with proper instructions, input and output operations. 
 */
package conversion;

import java.util.*;

/**
 *
 * @author Nafees Syed
 */
public class Conversion {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("1) CAD to USD");
        System.out.println("2) Celsius to Fahrenheit");
        System.out.println("3) Meters to feet");
        System.out.println("4) Kilometer to mile");
        System.out.println("5) feet to centimeter");

        System.out.print("Choose between these conversion: ");
        int number = kb.nextInt();

        switch (number) {
            case 1:
                System.out.print("Enter the amount in CAD: ");
                double cad = kb.nextDouble();
                double convertUsd = cad * 0.73;
                System.out.println("In USD it will be: " + convertUsd);
                break;
            case 2:
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = kb.nextDouble();
                double convertFahr = (celsius * (9 / 5)) + 32;
                System.out.println("In Fahrenheit it will be: " + convertFahr);
                break;
            case 3:
                System.out.print("Enter the measurment in meters: ");
                double meters = kb.nextDouble();
                double convertFeet = meters * 3.28;
                System.out.println("In Feet it will be: " + convertFeet);
                break;
            case 4:
                System.out.print("Enter the distance in KM: ");
                double kilometer = kb.nextDouble();
                double convertMile = kilometer * 1.609;
                System.out.println("In miles it will be: " + convertMile);
                break;
            default:
                System.out.print("Enter the measurement in Feet: ");
                double feet = kb.nextDouble();
                double convertCm = feet * 30.48;
                System.out.println("In Centimeters it will be: " + convertCm);
        }
    }

}
