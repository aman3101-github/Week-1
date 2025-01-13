import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Initial Value assigned for the sum total sum is zero
        double total = 0.0;
        
        while (true) {
		// Taking the numbers as the user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();
            
			// Condition for the loop to break
            if (number <= 0) {
                break;
            }
            
			// Sum of the user input numbers
            total += number;
        }
        
		// Displaying the total sum of all the numbers 
        System.out.println("Total sum is: " + total);
        
		// Closing the scanner object 
        input.close();
    }
}
