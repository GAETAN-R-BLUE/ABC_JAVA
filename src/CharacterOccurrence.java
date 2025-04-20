import java.util.HashMap;  // Import the HashMap class to store character-count pairs
import java.util.Scanner;  // Import Scanner for user input

public class CharacterOccurrence {
    public static void main(String[] args) {

        // Prompt the user to enter a sentence
        System.out.println("Enter your word or sentence:");

        // Read the full line, convert to lowercase, and remove everything except letters a-z
        String sentence = new Scanner(System.in).nextLine().toLowerCase().replaceAll("[^a-z]", "");  // Remove all non-alphabetic characters

        // Create a HashMap to store each character and its number of occurrences
        HashMap<Character, Integer> occurrence = new HashMap<>();

        // Loop through each character in the cleaned sentence
        for (char c : sentence.toCharArray()) {
            // Add the character to the map with count +1, or start from 1 if not already present
            occurrence.put(c, occurrence.getOrDefault(c, 0) + 1);
        }

        // Print the number of times each letter (a to z) appears
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Get the count of the character or 0 if it's not in the map
            int count = occurrence.getOrDefault(ch, 0);
            // Display the character and its count
            System.out.println(ch + ": " + count);
        }
    }
}