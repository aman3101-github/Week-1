import java.util.Scanner;
public class NumberSign {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the number as user input
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
		// Checking for the Number Sign and displaying the result
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
		// Closing the scanner object
        input.close();
    }
}
