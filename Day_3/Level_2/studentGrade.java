import java.util.Scanner;

public class studentGrade {
    public static void main(String[] args) {
        
        // Creating a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        // Validating the input number of students
        if (numOfStudents <= 0) {
            System.err.println("Invalid number of students. Please enter a positive number.");
            System.exit(0);
        }
        
        // Creating arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numOfStudents];
        int[] chemistryMarks = new int[numOfStudents];
        int[] mathsMarks = new int[numOfStudents];
        double[] percentages = new double[numOfStudents];
        String[] grades = new String[numOfStudents];
        
        // Loop to take input marks for each student
        for (int i = 0; i < numOfStudents; i++) {
            // Taking input for marks in Physics
            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
            physicsMarks[i] = input.nextInt();
            if (physicsMarks[i] < 0) {
                System.err.println(" Please enter marks not less than zero");
                i--; // Decrement the index to retry
                continue;
            }

            // Taking input for marks in Chemistry
            System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
            chemistryMarks[i] = input.nextInt();
            if (chemistryMarks[i] < 0) {
                System.err.println(" Please enter marks not less than zero");
                i--; // Decrement the index to retry
                continue;
            }

            // Taking input for marks in Maths
            System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
            mathsMarks[i] = input.nextInt();
            if (mathsMarks[i] < 0) {
                System.err.println(" Please enter marks not less than zero");
                i--; // Decrement the index to retry
                continue;
            }
        }

        // Loop to calculate percentage and grade for each student
        for (int i = 0; i < numOfStudents; i++) {
            // Calculate the percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
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
        System.out.println("\nStudent Results:");
        System.out.println("  ");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println("  ");
        }

        // Closing the scanner object
        input.close();
    }
}
