import java.util.Scanner;

public class factorOperations {

    // Method to find the factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // Counting the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Creating an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Storing the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Validating input
        if (number <= 0) {
            System.err.println("Please enter a positive integer greater than zero.");
        } else {
            // Finding the factors of the number
            int[] factors = findFactors(number);

            // Displaying the factors
            System.out.print("The factors of " + number + " are: ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            // Calculating the sum, product, and sum of squares of the factors
            int sum = sumOfFactors(factors);
            int product = productOfFactors(factors);
            double sumOfSquares = sumOfSquaresOfFactors(factors);

            // Displaying the results
            System.out.println("Sum of the factors: " + sum);
            System.out.println("Product of the factors: " + product);
            System.out.println("Sum of the squares of the factors: " + sumOfSquares);
        }

        // Closing the scanner object
        scanner.close();
    }
}
