/* ************************************************************************
 * This program is a table multiplication generator based on the user input
 * Gaetan Gansob 01/06/1998
 * *************************************************************************/
import java.util.Scanner;

public class MultiplicationGenerator {
    public static void main(String[] args) {
        System.out.println("Enter a positive Integer ");
        int number = new Scanner(System.in).nextInt();
        // Check if the entered number is less than or equal to 0 and print an error message
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }
        // Call the method to print the multiplication table of the entered number
        printMultiplicationTable(number);
    }
    // Method that prints the multiplication table of a given number
    public static void printMultiplicationTable (int a){
     for(int i = 1; i <= a; i++) {
         System.out.println( a + " * " + i + " = " + (i*a));
     }
    }
}
