import java.util.Scanner;

public class LargestElementModified {
    public static void main(String args[]) {
        
        // Creating the scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declaring a variable to store the user input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize the size of the array and the index variable
        int maxDigit = 10; // Initial size of the array
        int index = 0; // Tracks the index of the array 
        
        // Declare the array to store the digits of the number
        int[] array = new int[maxDigit];
        
        // Declare and initialize the largest and second-largest elements to zero
        int largestElement = 0;
        int secondLargestElement = 0;
        
        // Extract digits from the number and store them in the array
        while (number > 0) {
            // Check if the index reached the current maxDigit, resize if needed
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                
                // Create a new temporary array with the updated size
                int[] tempArray = new int[maxDigit];
                
                // Copy the existing elements from the old array to the new array
                for (int i = 0; i < array.length; i++) {
                    tempArray[i] = array[i];
                }
                
                // Reassign the original array to the new larger array
                array = tempArray;
            }
            
            // Extract the last digit and store it in the array
            int lastDigit = number % 10;
            array[index] = lastDigit;
            index++; // Increment the index
            
            // Update the number
            number /= 10;
        }
        
        // Loop through the array to find the largest and second largest element
        for (int i = 0; i < index; i++) {
            // Update the largest element if a larger digit is found
            if (array[i] > largestElement) {
                secondLargestElement = largestElement; // Update second largest
                largestElement = array[i]; // Update largest element
            }
            // Update second largest element if a smaller but still larger than second largest is found
            else if (array[i] > secondLargestElement && array[i] < largestElement) {
                secondLargestElement = array[i];
            }
        }
        
        // Print the largest and second largest elements
        System.out.println("The largest element is: " + largestElement);
        System.out.println("The second largest element is: " + secondLargestElement);
        
        // Close the scanner object
        input.close();
    }
}
