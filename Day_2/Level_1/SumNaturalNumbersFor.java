import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking number as user input
        System.out.println("Enter a natural number: ");
        int number = input.nextInt();
        
		// Checking if the user input is a natural number
        if (number > 0) {
		
		// Assigning initial sum as zero
            int sum = 0;
            
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            // Calculating the sum of natural numbers and display the result
            int formulaSum = number * (number + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println(number + " is not a natural number.");
        }
        
		// Close the scanner object 
        input.close();
    }
}
