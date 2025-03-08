/* 
 * Student :202037006 권도윤
 * Class name : Object-Oriented_Programming
 * Program purpose : Read your birth year and print your age
*/
import java.util.Scanner;
import java.time.LocalDate; // import Package to get Today's year

// Program that reads birth year from user and prints age
public class Ex1_2a {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Let me know your birth year");
        System.out.println("Please enter your birth year on a line:");

        int user_birthyear, now_year, user_age;

        now_year = LocalDate.now().getYear();
        // System.out.println(now_year);

        Scanner keyboard = new Scanner(System.in);
        user_birthyear = keyboard.nextInt();  // Get value of user's birth year
        
        while (user_birthyear > now_year) //Deffensive coding
        {
            System.out.println("You're not born yet");
            System.out.println("Please enter a valid birth year:");
            user_birthyear = keyboard.nextInt();  // Get value of user's birth year again
        }

        user_age = now_year - user_birthyear;

        System.out.println("Your age is: " + user_age);

        keyboard.close();
    }
}
