/* ---------------------------------------------------------------
 * THe program prompts the user for people's weigh, store it in an
 * array of double, output the array's numbers in one line follow
 * with one space and the display the total, average and the max
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package PEOPLESWEIGHT;

import java.util.Scanner;

public class PeopleWeight{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("How many entry will you enter?");
        int numOfEntry = userInput.nextInt();
        double [] weightList = new  double [numOfEntry];
        double total = 0;

        for (int i = 0; i < numOfEntry; i++){
            System.out.println("Enter Weight " + (i +1) );
            double weight = userInput.nextDouble();
            weightList [i] = weight;
            total += weight;
        }
        double max = weightList[0];

        System.out.print("You entered: ");
        for (double weight : weightList){
            System.out.print(weight + " ");
            if(weight > max){
                max = weight;
            }
        }
        System.out.println("\nTotal Weight: " + total + "\n" +
                "Average Weight: " + (total / weightList.length) + "\n" +
                "The Max Weight: " + max);
    }

}
