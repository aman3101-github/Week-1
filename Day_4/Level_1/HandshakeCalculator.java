import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        // Using the formula: n * (n - 1) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validating the input to ensure it is non-negative
        if (numberOfStudents < 0) {
            System.out.println("Error: Number of students cannot be negative.");
        } else {
            // Calculating the maximum number of handshakes using the method
            int handshakes = calculateHandshakes(numberOfStudents);

            // Displaying the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                               " students is: " + handshakes);
        }

        // Closing the scanner object
        scanner.close();
    }
}
