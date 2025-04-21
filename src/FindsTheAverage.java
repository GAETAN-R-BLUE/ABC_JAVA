// This program Calculates the average of a given array of numbers using a reusable method
import java.util.Scanner;

public class FindsTheAverage {
    public static void main(String[] args) {
        System.out.println("Enter a list of integer separated with space. Example: 1 2 3 4 etc...");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");
        int total = 0;
        for (int i = 0; i < userInput.length; i++){
            total += Integer.parseInt(userInput[i]);
        }
        System.out.println("the average of your array is " + average(total,userInput.length));

    }
    public static double average (double sum, double divisor ){
        return (sum /divisor);
    }
}
