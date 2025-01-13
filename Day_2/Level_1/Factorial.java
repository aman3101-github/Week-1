import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the user input
        System.out.print("Enter a number to find factorial: ");
        int number = input.nextInt();
        
		// Calculating the factorial of the number and displaying the results
        if (number >= 0) {
            int factorial = 1;
            
            while (number > 1) {
                factorial *= number;
                number--;
            }
            
            System.out.println("Factorial is: " + factorial);
        } else {
            System.out.println("Factorial is undefined for negative numbers.");
        }
        
		// Closing the scanner object
        input.close();
    }
}
