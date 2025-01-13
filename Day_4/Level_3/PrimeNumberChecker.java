import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
			// Numbers less than or equal to 1 are not prime
            return false;  
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
				// Number is divisible by i, so it's not prime
                return false;  
            }
        }
		// Number is prime if no divisors were found
        return true;  
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Sum the digits of the square of the number
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        // Neon number if sum of digits equals the number
        return sumOfDigits == number;  
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        
        // Calculate the sum and product of digits
        while (number != 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        // Spy number if sum equals product
        return sumOfDigits == productOfDigits;  
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        
        // Check if the square ends with the number itself
        return (square % (int) Math.pow(10, countDigits(number))) == number;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
		// Buzz number if divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7;  
    }

    // Method to count digits of a number
    public static int countDigits(int number) {
        int count = 0;
        if (number < 0) {
			// Convert negative numbers to positive
            number = -number;  
        }
        
        while (number != 0) {
            count++;
			// Remove the last digit of the number
            number /= 10;  
        }
        return count;
    }

    // Main method 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Check if the number is a neon number
        if (isNeon(number)) {
            System.out.println(number + " is a neon number.");
        } else {
            System.out.println(number + " is not a neon number.");
        }
        
        // Check if the number is a spy number
        if (isSpy(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
        
        // Check if the number is an automorphic number
        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        
        // Check if the number is a buzz number
        if (isBuzz(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }

        // Close the scanner
        input.close();
    }
}
