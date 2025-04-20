import java.util.HashMap;
import java.util.Scanner;

public class DigitsOccurrence {
    public static void main(String[] args) {
        System.out.println("Enter a number with at least 5 digits (e.g., 89542):");
        String userInput = new Scanner(System.in).nextLine();

        // Create a HashMap to store the occurrence of each digit
        HashMap<String, Integer> occur = new HashMap<>();

        // Loop through each character in the string
        for (char c : userInput.toCharArray()) {
            String key = String.valueOf(c);
            // Convert the character to String and update its count in the map
            if (occur.containsKey(key)) {
                // if the key already exists, increment its value by 1
                occur.put(key, occur.get(key) + 1);
            } else {
                // if the key doesn't exist, start its count at 1
                occur.put(key, 1);
            }
        }
        // Print the occurrences of each digit
        System.out.println("Digit occurrences:");
        for (String digit : occur.keySet()) {
            System.out.println(digit + " : " + occur.get(digit));
        }
    }
}