import java.util.Scanner;
public class DivisibleByFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the number as user input
        System.out.println("Enter a number: ");
        int number = input.nextInt();
		
        // Checking the divisibility by 5 
        boolean isDivisible = number % 5 == 0;
        
		// Display the result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        
		// Close the scanner object
        input.close();
    }
}
