import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Formula for Simple Interest
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Taking user input for principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Taking user input for rate of interest
        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        // Taking user input for time in years
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Validating inputs to ensure they are non-negative
        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Error: All inputs must be non-negative.");
        } else {
            // Calculating Simple Interest using the method
            double simpleInterest = calculateSimpleInterest(principal, rate, time);

            // Displaying the result
            System.out.println("The Simple Interest is " + simpleInterest + 
                               " for Principal " + principal + 
                               ", Rate of Interest " + rate + 
                               " and Time " + time + " years.");
        }

        // Closing the scanner object
        scanner.close();
    }
}
