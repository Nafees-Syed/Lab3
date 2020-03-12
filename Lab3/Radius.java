/*
Write a program that calculates the area of a circle, based on a radius given by the user. If the input is
negative, or zero, the program should not calculate the area, but warn the user of the mistake.
 */
package radius;
import java.util.*;

public class Radius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Prompt the user enter radius of a circle: ");
        double radius = kb.nextDouble();
        
        System.out.println("Radius: " + radius);
        
        double area = 3.14 * (radius * 2);
        
        if (area <= 0){
            System.out.println("There has been a mistake in the values"); 
        } else if (area >= 1){
            System.out.println("The area is: " + area);
        }
    }
    
}
