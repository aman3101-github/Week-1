import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // Defining an array to store the multiplication results
        int[] multiplicationTable = new int[10];

        // Calculating the multiplication table and storing results in the array
        for (int i = 0; i< 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Displaying the multiplication table
        System.out.println("The multiplication table of " + number + " is:");
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Closing the scanner
        input.close();
    }
}
