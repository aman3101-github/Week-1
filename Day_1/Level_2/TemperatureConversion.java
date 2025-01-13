import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Conversion of temperature into fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
		input.close();
    }
}
