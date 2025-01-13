import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Initialize the array and variables
        int maxFactor = 10;  // Initial size of the factors array
        int [] factors = new int[maxFactor];
		// To track the number of factors in the array
        int index = 0;  

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
			
                // Check if the size of array needs expansion
                if (index == maxFactor) {
					
					// Double the size of the array
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
					
                    // Copy existing factors to the new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
					// Update reference to the new array
                    factors = temp; 
                }
                // Add the factor to the array
                factors[index] = i;
				// Increment the index
                index++; 
            }
        }

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Close the input
        input.close();
    }
}
