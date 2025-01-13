import java.util.Scanner;

public class NumberCheckerPalindrome {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        if (number < 0) {
			// Make the number positive if it is negative
            number = -number;  
        }
        
        while (number != 0) {
            count++;
		// Removing the last digit of number 			
            number /= 10;  
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitsCount = countDigits(number);
        int[] digits = new int[digitsCount];
        
        if (number < 0) {
			// Convert negative numbers to positive
            number = -number;  
        }
        
        for (int i = digitsCount - 1; i >= 0; i--) {
			// Extract the last digit
            digits[i] = number % 10;  
            number /= 10;
        }
        
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        
        return reversedDigits;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        
        // A duck number must contain a non-zero digit, excluding the first one
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;  // Found a non-zero digit after the first one
            }
        }
        
        return false;  // No non-zero digits after the first one
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Store digits
        int[] digits = storeDigits(number);
        
        // Reverse digits
        int[] reversedDigits = reverseDigits(digits);
        
        // Print the number of digits
        System.out.println("Number of digits: " + countDigits(number));
        
        // Print the digits
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
        // Check if the number is a duck number
        if (isDuckNumber(number)) {
            System.out.println("The number is a duck number.");
        } else {
            System.out.println("The number is not a duck number.");
        }
        
        // Compare the original and reversed digits arrays
        if (compareArrays(digits, reversedDigits)) {
            System.out.println("The original and reversed arrays are equal.");
        } else {
            System.out.println("The original and reversed arrays are not equal.");
        }

        // Close the scanner
        input.close();
    }
}
