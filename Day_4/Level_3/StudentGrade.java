import java.util.Random;
import java.util.Scanner;

public class StudentGrade {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
		// 2D array to store scores for PCM
        int[][] scores = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores for Physics, Chemistry, and Math (between 10 and 99)
            scores[i][0] = rand.nextInt(90) + 10; // Physics score
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry score
            scores[i][2] = rand.nextInt(90) + 10; // Math score
        }

        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) {
		// 2D array to store total, average, and percentage
        double[][] results = new double[numStudents][4]; 

        for (int i = 0; i < numStudents; i++) {
            // Sum of scores
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Average of the scores
            double average = total / 3.0;
            // Percentage of total marks (out of 300)
            double percentage = (total / 300.0) * 100;

            // Round off the values to 2 decimal places using Math.round()
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; 
            results[i][2] = Math.round(percentage * 100.0) / 100.0; 
        }

        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("   ");

        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t\t" 
                + scores[i][0] + "\t" 
                + scores[i][1] + "\t\t" 
                + scores[i][2] + "\t" 
                + results[i][0] + "\t" 
                + results[i][1] + "\t\t" 
                + results[i][2]);
        }

        System.out.println("  ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Get random scores for students
        int[][] scores = generateScores(numStudents); 

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores, numStudents); 

        // Display the scorecard
        displayScorecard(scores, results, numStudents);
		
		// Closing the scanner object 
		input.close();
    }
}
