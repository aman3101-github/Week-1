import java.util.Scanner;

public class trigonometricFunctions {

    // Method to calculate trigonometric functions of the angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate the sine, cosine, and tangent of the angle
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Validate input for the angle
        if (angle < -360 || angle > 360) {
            System.err.println("Please enter an angle between -360 and 360 degrees.");
        } else {
            // Calculate the trigonometric values using the method
            double[] results = calculateTrigonometricFunctions(angle);

            // Display the results
            System.out.print("For an angle of " + angle + " degrees \n");
            System.out.print("\n Sine: " + results[0]);
            System.out.print("\n Cosine: " + results[1]);
            System.out.print("\n Tangent: " + results[2]);
        }

        // Closing the scanner object
        input.close();
    }
}
