import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Validate the input number to ensure it's positive
        if (number < 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);  // Exit the program if the input is invalid
        }
        
        // Find the count of digits in the number
        int count = 0;
        int temp = number;  // Use a temporary variable to preserve the original number
        
        // Count the number of digits by repeatedly dividing the number by 10
        while (temp > 0) {
            count++;  // Increment the count for each digit
            temp /= 10;  // Remove the last digit
        }
        
        // Create an array to store the digits of the number
        int[] digits = new int[count];
        
        // Store the digits in the array by extracting each digit
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;  // Extract the last digit
            number /= 10;  // Remove the last digit from the number
        }
        
        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // Loop through the digits array and update the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;  // Increment the frequency of the corresponding digit
        }
        
        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {  // Only display the digit if it appears at least once
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
        // Close the Scanner object
        input.close();
    }
}
