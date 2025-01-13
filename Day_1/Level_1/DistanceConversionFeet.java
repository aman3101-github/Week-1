import java.util.Scanner;
public class DistanceConversionFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the user input in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
		// Converting the distance in Yards and Miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        
		// Display the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		input.close();
		
    }
}
