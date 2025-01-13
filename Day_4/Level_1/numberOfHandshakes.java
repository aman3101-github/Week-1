import java.util.Scanner;

public class numberOfHandshakes {

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for numberOfStudents
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Validating the input to ensure it is non-negative
        if (numberOfStudents <= 0) {
            System.out.println(" Number of students must be greater than zero");
			System.exit(0);
        } else {
            // Calculating the maximum number of handshakes using the formula
            int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Displaying the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + 
                               " students is: " + handshakes);
        }

        // Closing the scanner object
        scanner.close();
    }
}
