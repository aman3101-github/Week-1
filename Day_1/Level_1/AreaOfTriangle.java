import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input for base
        System.out.print("Enter base of triangle in inches: ");
        double base = input.nextDouble();
        
		// User input for height
        System.out.print("Enter height of triangle in inches: ");
        double height = input.nextDouble();
        
		// Calculation of area in inches and centimeters
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 inch = 2.54 cm, hence 1 square inch = 6.4516 cm square
        
		// Display the results
        System.out.println("Area of Triangle: " + areaInInches + " square inches and " + areaInCm + " square centimeters");
		input.close();
		
    }
}
