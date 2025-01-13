import java.util.Scanner;

public class EuclideanEquation {

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Using the Euclidean distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the slope (m) and y-intercept (b) of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2];  // Array to store slope and y-intercept

        // Calculate slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double slope = (y2 - y1) / (x2 - x1);

        // Calculate y-intercept (b) using the formula: b = y1 - m * x1
        double yIntercept = y1 - (slope * x1);

        // Store slope and y-intercept in the array
        lineEquation[0] = slope;   // slope (m)
        lineEquation[1] = yIntercept;  // y-intercept (b)

        return lineEquation;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the first point (x1, y1)
        System.out.print("Enter the x-coordinate of the first point (x1): ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the first point (y1): ");
        double y1 = input.nextDouble();

        // Take input for the second point (x2, y2)
        System.out.print("Enter the x-coordinate of the second point (x2): ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of the second point (y2): ");
        double y2 = input.nextDouble();

        // Calculate the Euclidean distance between the points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the two points is: " + distance);

        // Calculate the line equation (slope and y-intercept)
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Display the equation of the line
        System.out.println("The equation of the line is: y = " + slope + "x + " + yIntercept);

        // Close the scanner
        input.close();
    }
}
