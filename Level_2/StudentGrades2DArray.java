import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        
        // Creating a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        // Validating the input number of students
        if (numOfStudents <= 0) {
            System.err.println("Please enter a positive number.");
            System.exit(0);
        }
        
        // Creating a 2D array to store marks for Physics, Chemistry, and Maths for each student
        int[][] marks = new int[numOfStudents][3];
        double[] percentages = new double[numOfStudents];
        String[] grades = new String[numOfStudents];
        
        // Loop to take input marks for each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            // Taking input for marks in Physics
            System.out.print("Physics marks: ");
            marks[i][0] = input.nextInt();
            if (marks[i][0] < 0) {
				System.out.print("Enter the number of students: ");
                i--; // Decrement the index to retry for the same student
                continue;
            }

            // Taking input for marks in Chemistry
            System.out.print("Chemistry marks: ");
            marks[i][1] = input.nextInt();
            if (marks[i][1] < 0) {
				System.out.print("Enter the number of students: ");
                i--; // Decrement the index to retry for the same student
                continue;
            }

            // Taking input for marks in Maths
            System.out.print("Maths marks: ");
            marks[i][2] = input.nextInt();
            if (marks[i][2] < 0) {
                System.out.print("Enter the number of students: ");
                i--; // Decrement the index to retry for the same student
                continue;
            }
        }

        // Loop to calculate percentage and grade for each student
        for (int i = 0; i < numOfStudents; i++) {
            // Calculate the percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            
  // Determine the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
				} 
			else if (percentages[i] >= 70) {
                grades[i] = "B";
					}
				
             else if (percentages[i] >= 60) {
                grades[i] = "C";
					}
				else if (percentages[i] >= 60) {
                grades[i] = "C";
					} 
				else if (percentages[i] >= 50) {
                grades[i] = "D";
					}
				else if (percentages[i] >= 40) {
                grades[i] = "E";
					}
					
			else {
                grades[i] = "R";
				}
        }

        // Display the marks, percentage, and grade for each student
        System.out.print("\nStudent Results:");
        System.out.println("   ");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("  ");
        }

        // Closing the scanner object
        input.close();
    }
}
