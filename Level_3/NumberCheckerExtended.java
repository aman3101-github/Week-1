import java.util.Scanner;

public class NumberCheckerExtended {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        // If number is negative, convert it to positive
        if (number < 0) {
            number = -number;
        }
        
        // Count the digits by repeatedly dividing the number by 10
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitsCount = countDigits(number);
        int[] digits = new int[digitsCount];
        
        if (number < 0) {
            number = -number;
        }
        
        // Store digits in the array
        for (int i = digitsCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        
        return digits;
    }

    // Method to find the sum of the digits of the number
    public static int sumOfDigits(int number) {
        int sum = 0;
        int[] digits = storeDigits(number);
        
        for (int digit : digits) {
            sum += digit;
        }
        
        return sum;
    }

    // Method to find the sum of the squares of the digits using Math.pow()
    public static int sumOfSquaresOfDigits(int number) {
        int sum = 0;
        int[] digits = storeDigits(number);
        
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Sum of squares of the digits
        }
        
        return (int) sum; // Casting the result as it returns double due to Math.pow()
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0; // Harshad number if divisible by the sum of digits
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9, 2 columns: digit and frequency
        
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][0] = digits[i]; // First column stores the digit
            frequency[digits[i]][1]++; // Second column stores the frequency of each digit
        }
        
        return frequency;
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
        
        // Find sum of digits
        System.out.println("Sum of digits: " + sumOfDigits(number));
        
        // Find sum of squares of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        
        // Check if the number is a Harshad number
        System.out.println("Is Harshad number: " + isHarshadNumber(number));
        
        // Find the frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) { // Display only the digits that appear
                System.out.println("Digit " + frequency[i][0] + " appears " + frequency[i][1] + " times.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
