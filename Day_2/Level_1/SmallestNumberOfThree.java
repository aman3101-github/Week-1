import java.util.Scanner;
public class SmallestNumberOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking numbers as input from the user 
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();
        
		// Checking if the first number is smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);
        
		// Display the result
        System.out.println("Is the first number the smallest? " + isSmallest);
        
		// Close the scanner object
        input.close();
    }
}
