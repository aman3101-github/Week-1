import java.util.Scanner;

public class QuadraticRoots {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant 
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // If discriminant is negative, return an empty array (no real roots)
        if (discriminant < 0) {
            return new double[0]; // No real roots
        } else if (discriminant == 0) {
            // One real root (both roots are the same)
            double root = -b / (2 * a);
			// Return the single root
            return new double[]{root}; 
        } else {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			// Return both roots
            return new double[]{root1, root2}; 
        }
    }

    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
		
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
		
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Call the method to find the roots
        double[] roots = findRoots(a, b, c);

        // Output the results
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: ");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }

        // Close the input
        input.close();
    }
}
