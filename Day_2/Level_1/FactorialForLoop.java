import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the user input to calculate the factorial
        System.out.print("Enter a number to find factorial: ");
        int number = input.nextInt();
        
		// Calculating the factorial for the user input 
        if (number >= 0) {
            int factorial = 1;
            
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial is: " + factorial);
        } else {
            System.out.println("Factorial is undefined for negative numbers.");
        }
        
		// Closing the scanner object
        input.close();
    }
}
