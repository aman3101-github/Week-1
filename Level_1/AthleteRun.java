import java.util.Scanner;

public class AthleteRun {

    // Method to compute the number of rounds needed to complete a 5 km run
    public static double calculateRounds(double side1, double side2, double side3) {
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance to cover (in meters)
        double totalDistance = 5000;

        // Calculate the number of rounds (ceiling of totalDistance / perimeter)
			double rounds = totalDistance / perimeter; 
        return  rounds; 
    }

    public static void main(String[] args) {
        // Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sides of the triangular park
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        // Validating that all sides are positive
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.err.println(" All sides must be greater than zero");
			System.exit(0);
        } else {
            // Calculating the number of rounds using the method
            double totalRounds = calculateRounds(side1, side2, side3);

            // Displaying the result
            System.out.println("The athlete needs to complete " + totalRounds + 
                               " rounds to cover 5 km in the triangular park.");
        }

        // Closing the scanner object
        scanner.close();
    }
}
