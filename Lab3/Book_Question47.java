/*
Write a program that takes two words as input from the keyboard, representing 
a password and the same password again.(Often, websites ask users to type their 
password twice when they register to make sure there was no typo the first time 
around.)Your program should output "welcome,_____" if the password has no typo 
and that it is between 6 and 10 character long, if not, output "Sorry, User ID invalid".
 */
package book_question.pkg47;

import java.util.*;

/**
 *
 * @author my_as
 */
public class Book_Question47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a password between 6 to 10 character long: ");
        String pass1 = kb.nextLine();

        System.out.print("Enter the password again: ");
        String pass2 = kb.nextLine();

        int length = pass1.length();

        if (pass1 == pass2) {

        } else if (length >= 6 && length <= 10) {
            System.out.println("Welcome, Natsu");
        } else 
            System.out.println("Sorry, the user ID is invalid!");
        

    }

}
