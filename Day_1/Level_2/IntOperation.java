import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for the numbers 
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Performing  Arithmetic Operations on the numbers
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);
		input.close();
    }
}
