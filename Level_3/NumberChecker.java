import java.util.Scanner;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        // If number is negative, convert to positive
        if (number < 0) {
            number = -number;
        }
        
        // Count the digits by repeatedly dividing the number by 10
        while (number != 0) {
            count++;
			// Update the number
            number /= 10;  
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        // Count the digits first
        int digitsCount = countDigits(number);
        
        // Initialize an array to hold the digits
        int[] digits = new int[digitsCount];
        
        // If the number is negative, convert it to positive
        if (number < 0) {
            number = -number;
        }
        
        // Store digits in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = number % 10;  
			
            digits[i] = number % 10; 
			// Remove the last digit
            number /= 10;  
        }
        
        return digits;
    }

    // Method to check if a number is a Duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        
        // A Duck number must contain at least one non-zero digit and must not start with zero
        if (digits[0] == 0) {
            return false;  // Duck numbers cannot start with zero
        }
        
        // Check for a non-zero digit
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
				// It's a Duck number if any non-zero number is found
                return true;  
            }
        }
        
		//  non-zero digit not found
        return false;  
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = storeDigits(number);
        int numberOfDigits = digits.length;
        int sum = 0;
        
        // Calculate the sum of each digit raised to the power of the number of digits 
        for (int i = 0; i < digits.length; i++) {
			// raise the digit to the power
            sum += Math.pow(digits[i], numberOfDigits);  
        }
        
        // Check if the sum equals the original number
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find largest and second largest by iterating through the digits
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        // Find smallest and second smallest by iterating through the digits
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        
        return new int[] {smallest, secondSmallest};
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Count digits
        System.out.println("Count of digits: " + countDigits(number));
        
        // Store digits
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        // Check if it's a Duck number
        System.out.println("Is Duck number: " + isDuckNumber(number));
        
        // Check if it's an Armstrong number
        System.out.println("Is Armstrong number: " + isArmstrong(number));
        
        // Find largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
        
        // Find smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
        
        // Close the scanner
        scanner.close();
    }
}
