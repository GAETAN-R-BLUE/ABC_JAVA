import java.util.Scanner;

import static java.lang.System.*;

public class Prime {
    public static void main(String[] args) {
        out.println("Enter a positive integer greater than 1:");
        int number = new Scanner(in).nextInt();

        if (number <= 1) {
            out.println("Prime numbers must be greater than 1.");
            return;
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        boolean isPrime = (count == 2);
        out.println(number + " is a prime number: " + isPrime);

    }
}