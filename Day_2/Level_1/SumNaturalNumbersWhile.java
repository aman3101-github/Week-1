import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the number as the input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
		// Checking if the user input is a natural number 
        if (number > 0) {
            int sum = 0;
            int i = 1;
            
            while (i <= number) {
                sum += i;
                i++;
            }
            
			// Calculating the sum of natural numbers  and displaying the results
            int formulaSum = number * (number + 1) / 2;
            System.out.println("Sum using loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
        } else {
            System.out.println(number + " is not a natural number.");
        }
        
		// Closing the scanner object 
        input.close();
    }
}
