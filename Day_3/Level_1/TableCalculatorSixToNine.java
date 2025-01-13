import java.util.Scanner;

public class TableCalculatorSixToNine {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Taking number as the user input
        System.out.println("Enter the number: ");
        int number = input.nextInt();

        // Declaration of the array to store the results
        int[] multiplicationResult = new int[4];

        // Calculating the multiplication
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; 
        }

        // Printing the multiplication table
        System.out.println("The multiplication table of " + number + " is: ");
        for (int j = 6; j <= 9; j++) {
            System.out.println(number + " * " + j + " = " + multiplicationResult[j - 6]); 
        }

		// Closing the scanner object
        input.close(); 
    }
}
