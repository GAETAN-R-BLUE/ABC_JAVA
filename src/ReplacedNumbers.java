// This program replaced anny number that is less than 0 by 0
import java.util.Scanner;

public class ReplacedNumbers {
    public static void main(String[] args) {

        // Prompt the user to enter a list of numbers separated by spaces
        System.out.println("Please enter a list of numbers separated by spaces:");

        // Read user input and split it into an array
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        // Loop through the array and replace negative numbers with 0
        for (int i = 0; i < userInput.length; i++) {
            if (Integer.parseInt(userInput[i]) < 0) {
                userInput[i] = "0";
            }
            System.out.print(userInput[i] + " ");
        }
    }
}
