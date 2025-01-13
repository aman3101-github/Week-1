import java.util.Scanner;

public class factorOperations {

    // Method to find factors of the number and return them in an array
    public static int[] findFactors(int number) {
        // First loop to count how many factors there are
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Second loop to store the factors in the array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to calculate the sum of the factors
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to calculate the product of the factors
    public static int calculateProduct(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to calculate the sum of the squares of the factors
    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("The factors of " + number + " are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Calculate and display the sum of the factors
        int sum = calculateSum(factors);
        System.out.println("The sum of the factors is: " + sum);

        // Calculate and display the product of the factors
        int product = calculateProduct(factors);
        System.out.println("The product of the factors is: " + product);

        // Calculate and display the sum of squares of the factors
        double sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("The sum of the squares of the factors is: " + sumOfSquares);

        // Close the scanner object
        input.close();
    }
}
