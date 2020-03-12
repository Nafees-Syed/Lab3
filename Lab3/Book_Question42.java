/*
Write a program that takes two ints as imputs from the keyboard, representing 
the number of hits and the number of at-bats for a batter. Then calculate the 
batter's hitting percentage and check if the hitting percentage is above 0.300.
if it is, output that the player is eligible for the All-Star Game; Otherwise,
output that the player is not eligible.
 */
package book_question.pkg42;
import java.util.*;
/**
 *
 * @author Nafees Syed
 */
public class Book_Question42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the number of hits: ");
        int hit = kb.nextInt();
        
        System.out.print("Enter the number of at-bats: ");
        int atBats = kb.nextInt();
        
        double percent = ((double)hit/(double)atBats);
        
        System.out.println("The percentage of the player is: " + percent);
        
        if(percent >= 0.3){
            System.out.println("Congratulations! You have been accepted to play in the All-Star Games!!!");
        } else if(percent < 0.3){
            System.out.println("Unfortunatly, you have not qualified for the All-Star...");
        }
    }
    
}
