import java.util.Scanner;

public class GreatestFactor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		
		// Taking the number as the user input
		System.out.println("Enter the number: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        
        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i; 
                break;  // Exit the loop as we've found the greatest factor
            }
        }
        
        // Print the greatest factor
        System.out.println("The greatest factor for " + number + " is " + greatestFactor);
		
		// Closing the scanner object
        input.close();
    }
}
