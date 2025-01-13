import java.util.Scanner;
public class KilometerToMileConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();
		
		// Calculate the distance in miles 
        double miles = km * 1.6;
		
        // Display the results 
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
		input.close();
    }
}
