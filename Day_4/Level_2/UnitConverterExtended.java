import java.util.Scanner;

public class UnitConverterExtended {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        // Conversion factor: 1 km = 0.621371 miles
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        // Conversion factor: 1 mile = 1.60934 km
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        // Conversion factor: 1 meter = 3.28084 feet
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        // Conversion factor: 1 foot = 0.3048 meters
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        // Conversion factor: 1 yard = 3 feet
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        // Conversion factor: 1 foot = 0.333333 yards
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        // Conversion factor: 1 meter = 39.3701 inches
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        // Conversion factor: 1 inch = 0.0254 meters
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static void main(String[] args) {
        // Creating the scanner object
        Scanner input = new Scanner(System.in);

        // Convert yards to feet
        System.out.print("Enter yards to convert to feet: ");
        double yards = input.nextDouble();
        double feetFromYards = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetFromYards + " feet.");

        // Convert feet to yards
        System.out.print("Enter feet to convert to yards: ");
        double feet = input.nextDouble();
        double yardsFromFeet = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardsFromFeet + " yards.");

        // Convert meters to inches
        System.out.print("Enter meters to convert to inches: ");
        double meters = input.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");

        // Convert inches to meters
        System.out.print("Enter inches to convert to meters: ");
        double inchesInput = input.nextDouble();
        double metersFromInches = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput + " inches is equal to " + metersFromInches + " meters.");

        // Close the scanner object
        input.close();
    }
}
