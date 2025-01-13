import java.util.Scanner;

public class quotientAndRemainder {

    // Method to find the quotient and remainder of a number
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate the quotient
        int quotient = number / divisor;
        // Calculate the remainder
        int remainder = number % divisor;

        // Return an array containing quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter the number to be divided: ");
        int number = scanner.nextInt();

        // Taking user input for the divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Validate divisor to ensure it is not zero
        if (divisor == 0) {
            System.err.println("Division by zero is not allowed.");
        } else {
            // Call the method to get quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the results
            System.out.println("The quotient is: " + result[0]);
            System.out.println("The remainder is: " + result[1]);
        }

        // Close the scanner
        scanner.close();
    }
}
