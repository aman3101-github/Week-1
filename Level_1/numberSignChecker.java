import java.util.Scanner;

public class numberSignChecker {

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // User input to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using the method to determine the type of number
        int result = checkNumber(number);

        // Displaying the result based on the returned value
        if (result == 1) {
            System.out.println("The number " + number + " is positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }

        // Closing the scanner object
        scanner.close();
    }
}
