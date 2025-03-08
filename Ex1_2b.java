/* 
 * Student :202037006 권도윤
 * Class name : Object-Oriented_Programming
 * Program purpose : Read two integers and display the number of integers
 between them, including themselves
*/
import java.util.Scanner;

public class Ex1_2b {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = keyboard.nextInt();
                
        System.out.print("Enter the second integer: ");
        int num2 = keyboard.nextInt();
                
        // Ensure num1 is the smaller number using if statement
        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }
                
        // Print the numbers
        System.out.print("Numbers between " + num1 + " and " + num2 + " includes:  ");
        for (int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
                
        keyboard.close();
    }
}
