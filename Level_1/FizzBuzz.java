import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        
        // Creating a scanner object 
        Scanner input = new Scanner(System.in);

        // Validate the number and take the correct input
        int number;
        while (true) {
            // Taking the user input
            System.out.print("Enter the number: ");
            number = input.nextInt();

            // Checking if the number is valid
            if (number > 0) {
                break; // Exit the loop if the number is valid
            } else {
                System.err.println("Please enter a number greater than zero");
            }
        }

        // Declaration of array of size 'number' to store the result
        String[] array = new String[number];

        // Declaring and initializing a variable to track the elements in the array
        int index = 0;

        // Looping from 1 to 'number' for a valid number
        for (int i = 1; i <= number; i++) {
            
            // Multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                array[index] = "FizzBuzz";
                index++;
            }
            // Multiple of 3
            else if (i % 3 == 0) {
                array[index] = "Fizz";
                index++;
            }
            // Multiple of 5
            else if (i % 5 == 0) {
                array[index] = "Buzz";
                index++;
            }
            // Any other condition
            else {
                array[index] = String.valueOf(i);
                index++;
            }
        }

        // Printing the results in the correct format
        for (int i = 0; i < array.length; i++) {
            System.out.println(" At Index " + (i + 1) + " = " + array[i]);
        }
        
        // Closing the scanner object
        input.close();
    }
}
