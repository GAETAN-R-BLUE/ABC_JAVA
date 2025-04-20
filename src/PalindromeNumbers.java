import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer");
        int userInput = (new Scanner(System.in).nextInt());
        String number = Integer.toString(userInput);
        String newNumber = "";
        for (int i = number.length()-1; i >= 0; i--){
          newNumber += number.charAt(i);
        }

        if(newNumber.equals(number)){
            System.out.println(userInput + " is a palindrome");
        }
        else{
            System.out.println(userInput + " is not a palindrome");
        }
    }
}
