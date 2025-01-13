import java.util.Scanner;

public class CollinearPoints {

    // Method to calculate the slope between two points
    public static double calculateSlope(double x1, double y1, double x2, double y2) {
        // Slope formula: (y2 - y1) / (x2 - x1)
        return (y2 - y1) / (x2 - x1);
    }

    // Method to check if the points are collinear using slope formula
    public static boolean areCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate slopes AB, BC, and AC
        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);
        double slopeAC = calculateSlope(x1, y1, x3, y3);

        // Points are collinear if the slopes are equal
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    // Method to check if the points are collinear using area of triangle formula
    public static boolean areCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Area of triangle formula: 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area of the triangle is 0
        return area == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take input for the coordinates of three points
        System.out.print("Enter the x-coordinate of point A: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y-coordinate of point A: ");
        double y1 = input.nextDouble();

        System.out.print("Enter the x-coordinate of point B: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y-coordinate of point B: ");
        double y2 = input.nextDouble();

        System.out.print("Enter the x-coordinate of point C: ");
        double x3 = input.nextDouble();
        System.out.print("Enter the y-coordinate of point C: ");
        double y3 = input.nextDouble();

        // Check if the points are collinear using the slope formula
        boolean collinearUsingSlope = areCollinearUsingSlope(x1, y1, x2, y2, x3, y3);

        // Check if the points are collinear using the area formula
        boolean collinearUsingArea = areCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        // Display results
        if (collinearUsingSlope && collinearUsingArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        // Close the scanner
        input.close();
    }
}
