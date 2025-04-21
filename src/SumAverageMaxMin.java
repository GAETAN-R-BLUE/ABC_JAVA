import java.util.Scanner;

public class SumAverageMaxMin {
    public static void main(String[] args) {
            System.out.println("Enter a list of integer separated with space. Example: 1 2 3 4 etc...");
            String [] userInput = new Scanner(System.in).nextLine().split(" ");
            int total = 0;
            int max = Integer.parseInt(userInput[0]);
            int min = Integer.parseInt(userInput[0]);

            for (int i = 0; i < userInput.length; i++){
                int currentNumber = Integer.parseInt(userInput[i]);
                total += currentNumber;
                if (max < currentNumber){
                    max = currentNumber;
                } else if (min > currentNumber) {
                    min = currentNumber;
                }
            }
            System.out.println("The Total of your array is :" + total);
            System.out.println("the average of your array is " + average(total,userInput.length));
            System.out.println("The max number is: " + max);
            System.out.println("The min number is: " + min);
        }
        public static double average (double sum, double divisor ){
            return (sum /divisor);
    }

}
