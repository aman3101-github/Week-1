import java.util.Scanner;
public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User Input of the sides of triangular park in meters
        System.out.println("Enter first side: ");
        double side1 = input.nextDouble();
		
        System.out.println("Enter second side: ");
        double side2 = input.nextDouble();
		
        System.out.println("Enter third side ");
        double side3 = input.nextDouble();

        // Calculate perimeter of the park
        double perimeter = side1+ side2 + side3;

        // Total distance to cover by the athlete (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate number of rounds
        double rounds = totalDistance/perimeter;

        // Display the Output
        System.out.println("The total number of rounds the athlete will run is " + rounds);
		input.close();
    }
}
