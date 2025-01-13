import java.util.Scanner;

public class chocolateDistribution {

    // Method to calculate the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Calculate the number of chocolates each child gets 
        int quotient = number / divisor;
        // Calculate the remaining chocolates 
        int remainder = number % divisor;

        // Return an array containing quotient and remainder
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of chocolates
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        // Taking user input for the number of children
        System.out.print("Enter the total number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate input to ensure no division by zero
        if (numberOfChildren == 0) {
            System.err.println("Number of children cannot be zero.");
        } else if (numberOfChocolates < 0 || numberOfChildren < 0) {
            System.err.println("Number of chocolates and children must not be negative.");
        } else {
            // Call the method to calculate the distribution of chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the scanner
        input.close();
    }
}
