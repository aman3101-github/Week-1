import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age) {
        // Validate if the age is a valid positive number
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        // Check if the age is greater than or equal to 18
        return age >= 18;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for taking input from the user
        Scanner input = new Scanner(System.in);
        
        // Define an array to store the age of 10 students
        int[] ages = new int[10];
        
        // Loop through the array and take input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = input.nextInt(); // Take age input from user
        }

        // Check if each student can vote and display the result
        for (int i = 0; i < ages.length; i++) {
            boolean canVote = canStudentVote(ages[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner object
        input.close();
    }
}
