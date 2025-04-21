// I was help by AI on this one because I did not understand the way of doing it with math

import java.util.Scanner;

public class IsThisNumberAPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer:");
        int userInput = new Scanner(System.in).nextInt();
        int originalNumber = userInput;
        int reversedNumber = 0;

        while (userInput > 0) {
            int digit = userInput % 10;                      // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;    // Append digit to reversed number
            userInput = userInput / 10;                      // Remove the last digit
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}