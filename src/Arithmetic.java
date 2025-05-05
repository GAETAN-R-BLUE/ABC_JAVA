import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Enter 2 number separated with space. Example: 1 2.");
        String [] input = new Scanner(System.in).nextLine().split(" ");
        System.out.println("Select the operation to operate:");
        System.out.println("1. Addition:");
        System.out.println("2. Subtraction:");
        System.out.println("3. Multiplication:");
        System.out.println("4. Division:");


    }
    public static void printSum (int a, int b){
        System.out.println("The sum of the 2 number is " + (a + b));
    }
    public static void printDiff (int a, int b){
        System.out.println("The difference of the 2 number is " + (a - b));
    }
    public static void printProduct (int a, int b){
        System.out.println("The product of the 2 number is " + (a * b));
    }
    public static void printQuotient (int a, int b){
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
