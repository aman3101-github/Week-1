import java.util.Scanner;

public class TemperatureUnitConverter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Conversion formula: (fahrenheit - 32) * 5 / 9
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        // Conversion formula: (celsius * 9 / 5) + 32
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        // Conversion factor: 1 pound = 0.453592 kilograms
        double poundsTokilograms = 0.453592;
        return pounds * poundsTokilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        // Conversion factor: 1 kilogram = 2.20462 pounds
        double kilogramsTopounds = 2.20462;
        return kilograms * kilogramsTopounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        // Conversion factor: 1 gallon = 3.78541 liters
        double gallonsToliters = 3.78541;
        return gallons * gallonsToliters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        // Conversion factor: 1 liter = 0.264172 gallons
        double litersTogallons = 0.264172;
        return liters * litersTogallons;
    }

    // Main method to take user input and perform conversions
    public static void main(String[] args) {
        // Creating the scanner object for user input
        Scanner input = new Scanner(System.in);

        // Convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Convert Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = input.nextDouble();
        double fahrenheitResult = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is equal to " + fahrenheitResult + " Fahrenheit.");

        // Convert pounds to kilograms
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        // Convert kilograms to pounds
        System.out.print("Enter weight in kilograms: ");
        double kilogramsInput = input.nextDouble();
        double poundsResult = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsResult + " pounds.");

        // Convert gallons to liters
        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        // Convert liters to gallons
        System.out.print("Enter volume in liters: ");
        double litersInput = input.nextDouble();
        double gallonsResult = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsResult + " gallons.");

        // Close the scanner object
        input.close();
    }
}
