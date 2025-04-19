import java.util.Scanner;

import static java.lang.System.out;

public class CountingOddAndEven{
    public static void main(String[] args) {
        out.println("Enter you integer separated with space");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < userInput.length; i++){
            ;
            if (Integer.parseInt(userInput[i]) % 2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        out.println("There is " + evenCount + " even numbers in your array " + " and " + oddCount + " odd numbers");

    }
}
