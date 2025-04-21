import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number with at least 2 digits. Example: 12, 134 etc...");
        String number = new Scanner(System.in).nextLine();
        System.out.println("Your number has " + number.length() + " digits");
    }
}
