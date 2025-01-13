import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// User input for the height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
		
        // Conversion of height
        int feet = (int) (heightCm / 30.48);
        int inches = (int) ((heightCm % 30.48) / 2.54);
        
		// Display the result 
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
		input.close();
    }
}
