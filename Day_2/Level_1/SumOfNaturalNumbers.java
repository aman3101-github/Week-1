import java.util.Scanner;
public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the number as the user input
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
		// Checking if the number is a natural number 
        if (number > 0) {
			
			// Sum of the natural numbers upto the user input number
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is: " + sum);
        } else {
            System.out.println(number + " is not a natural number");
        }
        
		// Closing the Scanner object
        input.close();
    }
}
