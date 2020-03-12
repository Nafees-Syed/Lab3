/*
Write a program that prompts the user for his/her date of birth in the format YYYY-MM-DD
and outputs the user age, plus a message in the lines: “Your birthday is in XX days”,
or “Your birthday was XX days ago” (substitute XX by the calculated amount of days),
depending if the date in the current year has passed or not.

 */
package dateofbirth;

import java.util.*;

/**
 *
 * @author Nafees Syed
 */
public class DateOfBirth {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter your date of birth in the format YYY-MM-DD: ");
        
        int year = kb.nextInt();
        int month = kb.nextInt();
        int day = kb.nextInt();
        
        System.out.println("Date of birth: " + year + "-" + month + "-" + day);
        
    }

}
