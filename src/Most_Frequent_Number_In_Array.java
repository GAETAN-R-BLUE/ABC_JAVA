// Import necessary classes
import java.util.HashMap; // For storing number frequencies
import java.util.Scanner; // For reading user input

public class Most_Frequent_Number_In_Array {
    public static void main(String[] args) {

        // Prompt the user to enter integers
        System.out.println("Enter the list of integers separated with space:");

        // Read the input and split it into an array
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        // Create a HashMap to track the frequency of each number
        HashMap<String, Integer> numberId = new HashMap<>();

        // Loop through the array to count occurrences of each number
        for (String num : userInput) {
            // If the number already exists in the map, increment its count; otherwise, set it to 1
            numberId.put(num, numberId.getOrDefault(num, 0) + 1);
        }

        // Variables to track the most frequent number and its count
        String mostFrequent = "";
        int maxCount = 0;

        // Iterate through the map to find the number with the highest frequency
        for (String num : numberId.keySet()) {
            int count = numberId.get(num);
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        // Print the result
        System.out.println("The most frequent number is " + mostFrequent + " with " + maxCount + " occurrences.");
    }
}