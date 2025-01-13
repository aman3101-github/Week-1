import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking number for multiplication table as user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
		// Printing the multiplication table
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
		// Closing the scanner object
        input.close();
    }
}
