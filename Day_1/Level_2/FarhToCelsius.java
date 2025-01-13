import java.util.Scanner;
public class FarhToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for temperature in fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Conversion of temperature into celsius
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the Output
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
		input.close();
    }
}
