import java.util.Scanner;

public class sumNaturalNumbers {

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {	
            return 0;
        } else {
            // sum of first n numbers is n + sum of first (n-1) numbers
            return n + sumRecursive(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for number of natural numbers
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Checking if the number is a valid natural number (greater than 0)
        if (n <= 0) {
            System.err.println("Please enter a valid natural number greater than 0.");
			// Exit the program if the input is invalid
            System.exit(0);  
        }

        // Finding the sum using recursion
        int recursiveSum = sumRecursive(n);

        // Finding the sum using the formula
        int formulaSum = sumFormula(n);

        // Comparing the two results and printing the results
        if (recursiveSum == formulaSum) {
            System.out.println("The sum of the first " + n + " natural numbers is correct.");
            System.out.println("Sum (Recursive): " + recursiveSum);
            System.out.println("Sum (Formula): " + formulaSum);
        } else {
            System.out.println("Error: The results do not match.");
        }

        // Closing the scanner object
        input.close();
    }
}
