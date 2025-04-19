//This code has a logical error trying to find the second largest in an array
import java.util.Scanner;

public class TheSecondLargest {
    public static void main(String[] args) {
        System.out.println("Enter a list of integer separated with space. Example: 1 2 3 4 5 etc...");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");
        if (userInput.length == 1){
            System.out.println("There is no second largest in your array");
            return;
        }
        int [] numbers = new int[userInput.length];
        for(String number : userInput){
            numbers [Integer.parseInt(number)] = Integer.parseInt(number);
        }
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++){
            if (largest < numbers[i]){
                secondLargest =largest;
                largest = numbers[i];
            }
        }
        if (largest != secondLargest) {
            System.out.println("The second largest is " + secondLargest);
        }
        else {
            System.out.println("There is no second largest in your array");
        }
    }
}
