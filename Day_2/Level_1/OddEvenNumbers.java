import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
		// Printing the odd numbers between 1 and user input
        if (number > 0) {
            System.out.println("Odd numbers between 1 and " + number);
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
			
		// Printing the even numbers between 1 and user input
            System.out.println("\nEven numbers between 1 and " + number);
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
		// Closing the user input
        input.close();
    }
}
