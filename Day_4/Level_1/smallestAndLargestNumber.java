import java.util.Scanner;

public class smallestAndLargestNumber {

    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		// Initialize smallest with the first number
        int smallest = number1; 
		// Initialize largest with the first number
        int largest = number1;  

        // Check if the second number is smaller or larger
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }

        // Check if the third number is smaller or larger
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }

        // Return an array containing the smallest and largest numbers
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Call the method to find smallest and largest
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the results
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the scanner object
        input.close();
    }
}
