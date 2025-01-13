import java.util.Scanner;

public class windChillTemperature {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula to calculate wind chill
		double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
		
        return windChill; 
    }

    public static void main(String[] args) {
        // Scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        // Taking user input for the temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();

        // Taking user input for the wind speed
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Validate inputs to ensure valid conditions for the wind chill formula
        if (temperature > 50) {
            System.err.println(" Temperature only for temperatures 50°F or below.");
        } else if (windSpeed < 3) {
            System.err.println("Wind speeds 3 mph or greater.");
        } else {
            // Calculate the wind chill using the method
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the calculated wind chill
            System.out.println("The wind chill temperature is " + windChill);
        }

        // Close the scanner
        input.close();
    }
}
