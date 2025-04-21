import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Enter 2 integers separated by space:");
        String[] numbers = new Scanner(System.in).nextLine().split(" ");

        try {
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}