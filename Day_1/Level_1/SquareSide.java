import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        // User input for the perimeter of square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        
		// Calculating the side of square
        double side = perimeter / 4;
        
		// Display the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close();
    }
}
