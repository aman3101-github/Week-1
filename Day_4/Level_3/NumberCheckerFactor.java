import java.util.Scanner;

public class NumberCheckerFactor {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;

        // Loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors using the factors array
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int result = 1;
        for (int i = 1; i <= digit; i++) {
            result *= i;
        }
        return result;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Find factors of the number
        int[] factors = findFactors(number);
        
        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Find and display the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);
        
        // Find and display the sum of the factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);
        
        // Find and display the product of the factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);
        
        // Find and display the product of the cubes of the factors
        double productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);
        
        // Check and display if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        // Check and display if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }
        
        // Check and display if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }
        
        // Check and display if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        // Close the scanner
        input.close();
    }
}
