import java.util.Scanner;

public class LargestElement {
    public static void main(String args[]) {
        
        // Creating the scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize the size of the array and index variable
        int maxDigit = 10; // Maximum size of the array
        int index = 0;     // Tracks the array index
        
        // Declare the array to store the elements
        int[] array = new int[maxDigit];
        
        // Declare and initialize the largest and second-largest elements to zero
        int largestElement = 0;
        int secondLargestElement = 0;
        
        // Extract digits from the number and store them in the array
        while (number > 0) {
            // Check for index out of bounds
            if (index == maxDigit) {
                break; // Break the loop
            }
            
            // Extract the last digit and add it to the array
            int lastDigit = number % 10;
            array[index] = lastDigit;
            
            // Increment index of the array
            index++;
            
            // Update the number by removing the last digit
            number /= 10;
        }
        
        // Looping through the array to find the largest and second-largest elements
        for (int i = 0; i < index; i++) { 
            if (array[i] > largestElement) {
                // Update second largest
                secondLargestElement = largestElement; 
                // Update largest element
                largestElement = array[i]; 
            } else if (array[i] > secondLargestElement && array[i] < largestElement) {
                // Update second largest element
                secondLargestElement = array[i]; 
            }
        }
        
        // Print the results
        System.out.println("The largest element is: " + largestElement);
        System.out.println("The second largest element is: " + secondLargestElement);
        
        // Close the scanner object
        input.close();
    }
}
