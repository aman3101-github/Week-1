import java.util.Scanner;

public class naturalNumberSum {

    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0; // Initialize sum to 0
        
        // Loop from 1 to n to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // Add the current number to the sum
        }
        
		// Return the final sum
        return sum; 
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // user input to enter a positive integer
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        // Validate the input to ensure it is positive
        if (n <= 0) {
            System.err.println(" Please enter a positive integer greater than 0.");
        } else {
            // Calculate the sum using the method
            int sum = calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the scanner object
        input.close();
    }
}
