/*
Write a program that prompts the user for the current temperature in Celsius and outputs different
messages if it is above or below zero. You should use the conditional operator (?:) in this question.
*/
package temperature;
import java.util.*;

public class Temperature {

  
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter to current temperature: ");
        double temp = kb.nextDouble();
        System.out.println("Temperature: " + temp );
        
        if(temp < 0){
            System.out.println("below zero");
        } else if (temp > 0){
            System.out.println("abover zero");
        }
    }
    
}
