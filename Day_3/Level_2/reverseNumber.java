import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
		// Declaring the number
			int number;
        
        // Validating the number 
			while (true){
				// Taking the user input
				System.out.print("Enter the number: ");
				 number = input.nextInt();
				if(number >= 0){
					break;
				}
				else{
					System.err.print("Please enter a number greater than zero");
				}
			}

        // Find the count of digits in the number
        int digitCount = 0;
        int temp = number;
        while (temp > 0) {
            digitCount++;
            temp /= 10; // Remove the last digit
        }

        // Declare an array to store the digits of the number
        int[] array = new int[digitCount];

        // Loop to extract the digits and store them in the array
        int index = 0;
        while (number > 0) {
            array[index] = number % 10; // Extract the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Print the reverse of the number
        System.out.print("The reverse of the number is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        // Close the scanner object
        input.close();
    }
}
