// This program counts how many words are in a sentence given the user input
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.println("Please enter you sentence below ");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");
        System.out.println("Your sentence has " + (userInput.length ) + " words");
    }
}
