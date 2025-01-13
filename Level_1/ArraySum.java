

import java.util.Scanner;

public class ArraySum {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        // Declaration of array, and initialization of variables
        double[] arrayOfNumbers = new double[10];
        double totalSum = 0.0;
		int i = 0;
		
        while (true) {
            // Taking the user input for the elements of array
            System.out.print("Enter the number: ");
            double number = input.nextDouble();
			
			// Checking valid conditons for the element of array
            if (number <= 0 ||  i>= arrayOfNumbers.length) {
                break;
            }
            arrayOfNumbers[i] = number;
            i++;
        }
		
		// Calculating the total sum of the elements of array
		for(int j=0; j<arrayOfNumbers.length; j++){
					totalSum = totalSum + arrayOfNumbers[j];
				}
				
				// Printing the result of total sum
					System.out.print(totalSum);
				
			// Closing the input object 
			input.close();
    }
}