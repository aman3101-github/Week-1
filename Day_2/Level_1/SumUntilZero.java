import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Assiging the total as zero
        double total = 0.0;
        
        while (true) {
            System.out.println("Enter a number (0 to stop): ");
            double number = input.nextDouble();
          // Condition for loop to break when user enters zero
            if (number == 0) {
                break;
            }
            
			// Sum of numbers given by user as input
            total = total + number;
        }
        
		// Displaying the total sum of all the numbers
        System.out.println("Total sum is: " + total);
        
		// Closing the scanner object 
        input.close();
    }
}
