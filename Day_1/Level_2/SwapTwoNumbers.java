import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User Input for the two numbers to be swapped
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
		
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Swapping of the two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display the Output of the swapped numbers
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
		input.close();
    }
}
