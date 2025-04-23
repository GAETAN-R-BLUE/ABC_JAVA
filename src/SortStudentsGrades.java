/* *************************************************************************************
 * This Java program takes a list of student grades as input, sorts them in ascending order,
 * prints the sorted list, identifies the grades that are passing (≥70), and determines the
 * lowest and highest grade in the list. RGG 01/01/0000
 * *****************************************************************************************/
import java.util.ArrayList;     // For using dynamic arrays
import java.util.Collections;  // For sorting the array
import java.util.Scanner;      // For reading user input

public class SortStudentsGrades {
    public static void main(String[] args) {
        // Prompt the user to enter grades separated by spaces
        System.out.println("Enter the grades of your student separated with space");

        // Read the entire line and split it into an array of Strings
        String[] userInput = new Scanner(System.in).nextLine().split(" ");

        // Create an ArrayList to store grades as integers
        ArrayList<Integer> grades = new ArrayList<Integer>();

        // Convert each input string into an integer and add to the grades list
        for (String number : userInput) {
            grades.add(Integer.parseInt(number));
        }

        // Sort the list in ascending order
        Collections.sort(grades);

        // Print the sorted list of grades
        System.out.println("Sorted grade: " + grades);

        // Initialize highest and lowest grade with the first element in the list
        int highest = grades.getFirst();  // equivalent to grades.get(0)
        int lowest  = grades.getFirst();

        // Print the label for passing grades
        System.out.print("Passing Grade: [");

        // Iterate through the sorted list
        for (int grade : grades) {
            // If grade is 70 or higher, it's considered passing
            if (grade >= 70) {
                System.out.print(grade + " ");
            }

            // Update the highest grade if current grade is higher
            if (highest < grade) {
                highest = grade;
            }
            // Update the lowest grade if current grade is lower
            else if (lowest > grade) {
                lowest = grade;
            }
        }

        // Close the list of passing grades
        System.out.println("]");

        // Output the lowest and highest grades
        System.out.println("The lowest grade: " + lowest);
        System.out.println("The highest grade: " + highest);
    }
}