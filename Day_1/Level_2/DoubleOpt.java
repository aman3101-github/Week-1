import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking the user inputs
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Performing Operations on numbers
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3);
		input.close();
    }
}
