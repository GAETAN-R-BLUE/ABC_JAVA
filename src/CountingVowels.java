// Import the Scanner class to allow user input
import java.util.Scanner;

public class CountingVowels {
    public static void main(String[] args) {
        // Prompt the user to enter a sentence
        System.out.println("Enter your sentence:");

        // Read the full sentence input from the user and convert it to lowercase
        String sentence = new Scanner(System.in).nextLine().toLowerCase();

        // Initialize a counter to keep track of vowels
        int count = 0;

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            // Check if the current character is a vowel
            if     (sentence.charAt(i) == 'a' ||
                    sentence.charAt(i) == 'e' ||
                    sentence.charAt(i) == 'i' ||
                    sentence.charAt(i) == 'o' ||
                    sentence.charAt(i) == 'u') {
                count++;
            }
        }
        // Print the total number of vowels found
        System.out.println("The number of vowels in your sentence is: " + count);
    }
}