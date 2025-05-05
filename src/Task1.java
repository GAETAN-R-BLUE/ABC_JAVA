import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter 5 number separated with space. Example: 1 2 3 etc...");
        String [] userInput = new Scanner(System.in).nextLine().split(" ");

        ArrayList <Double> arraylist = new ArrayList<>();
        for (String number : userInput){
            arraylist.add(Double.parseDouble(number));
        }
        printSumAndAverage(arraylist);
    }
    public static void printSumAndAverage (ArrayList <Double> arrayList){
        int total = 0;
        for (double number : arrayList){
            total += number;
        }
        System.out.println( "The total is " + total);
        System.out.println("The average is " + (total/arrayList.size()) );
    }
}
