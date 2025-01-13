import java.util.Scanner;

public class UnitConverter {

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

    public static void main(String[] args) {
        // Creating the scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for kilometers input and perform conversion
        System.out.print("Enter kilometers to convert to miles: ");
        double km = input.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        // Prompt user for miles input and perform conversion
        System.out.print("Enter miles to convert to kilometers: ");
        double milesInput = input.nextDouble();
        double kmResult = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmResult + " kilometers.");

        // Prompt user for meters input and perform conversion
        System.out.print("Enter meters to convert to feet: ");
        double meters = input.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        // Prompt user for feet input and perform conversion
        System.out.print("Enter feet to convert to meters: ");
        double feetInput = input.nextDouble();
        double metersResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersResult + " meters.");
        
        // Close the scanner object 
        input.close();
    }
}
