import java.util.Scanner; // Import Scanner class for taking user input

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer"); // Prompt the user for input

        // Read user input using Scanner
        int number = new Scanner(System.in).nextInt();

        // Check if the number is negative
        if (number < 0 ){
            System.out.println("Invalid entry should be a positive integer"); // Print error if input is invalid
            return; // Exit the program early
        }
        else {
            // If valid input, call the factorial method and print the result
            System.out.println(number + "! is " + factorial(number));
        }
    }
    // Recursive method to calculate factorial of a number
    public static int factorial(int n){
        // Base case: factorial of 1 is 1
        if (n == 1 || n== 0){
            return 1;
        }
        // Recursive case: n * factorial(n - 1)
        return n * factorial(n - 1);
    }
}