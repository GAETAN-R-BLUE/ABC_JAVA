import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a positive integer");
        int userInput = (new Scanner(System.in).nextInt());
        String number = Integer.toString(userInput);
        for (int i = number.length()-1; i >= 0; i--){
           if(userInput < 0){
               System.out.print("-" + number.charAt(i));
           }
           else{
               System.out.print(number.charAt(i));
           }
        }
    }
}
