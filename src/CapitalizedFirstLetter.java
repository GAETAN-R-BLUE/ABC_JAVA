import java.util.Scanner; // We need this to read input from the user

public class CapitalizedFirstLetter {
    public static void main(String[] args) {

        // Ask the user to type a sentence
        System.out.println("Please enter your sentence below:");

        // Read the whole sentence and split it into words
        String[] sentence = new Scanner(System.in).nextLine().split(" ");

        // This will help us build the new sentence with capital letters
        String result = "";

        // Go through each word in the sentence
        for (String word : sentence) {
            if (!word.isEmpty()) { // Make sure the word is not empty
                // Get the first letter and make it uppercase
                String firstLetter = word.substring(0, 1).toUpperCase();

                // Get the rest of the word (from the second letter to the end)
                String restOfWord = word.substring(1);

                // Put the capitalized word together
                String capitalizedWord = firstLetter + restOfWord;

                // Add the word to our result string, followed by a space
                result += capitalizedWord + " ";
            }
        }

        // Print the final sentence with the first letter of each word capitalized
        System.out.println("Here is your sentence with capital letters:");
        System.out.println(result.trim()); // .trim() removes the extra space at the end
    }
}
