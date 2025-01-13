import java.util.Scanner;
class TravelComputation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // user input for their name
        System.out.println("Enter the traveler's name: ");
        String name = input.nextLine();

        // user input for the name of cities
        System.out.println("Enter the city you are traveling from: ");
        String fromCity = input.nextLine();

        System.out.println("Enter the city you are traveling via: ");
        String viaCity = input.nextLine();

        System.out.println("Enter the destination city: ");
        String toCity = input.nextLine();

        //  user input for the distances in miles (convert to kilometers)
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToViaMiles = input.nextDouble();
        double distanceFromToViaKm = distanceFromToViaMiles * 1.60934;  // Conversion factor from miles to kilometers

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCityMiles = input.nextDouble();
        double distanceViaToFinalCityKm = distanceViaToFinalCityMiles * 1.60934;  // Conversion factor from miles to kilometers

        // Ask the user for the time taken for each leg of the journey (in hours and minutes)
        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " (in hours): ");
        int hoursFromToVia = input.nextInt();
        System.out.println("Enter the minutes taken from " + fromCity + " to " + viaCity + ": ");
        int minutesFromToVia = input.nextInt();
        
        System.out.println("Enter the time taken from " + viaCity + " to " + toCity + " (in hours): ");
        int hoursViaToFinalCity = input.nextInt();
        System.out.println("Enter the minutes taken from " + viaCity + " to " + toCity + ": ");
        int minutesViaToFinalCity = input.nextInt();

        // Convert the time to total minutes
        int timeFromToVia = (hoursFromToVia * 60) + minutesFromToVia;
        int timeViaToFinalCity = (hoursViaToFinalCity * 60) + minutesViaToFinalCity;

        // Calculate the total distance and total time
        double totalDistance = distanceFromToViaKm + distanceViaToFinalCityKm;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("\nTravel Summary for " + name);
        System.out.println("From " + fromCity + " to " + toCity + " via " + viaCity);
        System.out.println("Total Distance: " + totalDistance + " kilometers");
        System.out.println("Total Time: " + totalTime / 60 + " hours and " + totalTime % 60 + " minutes");
        
        input.close();
    }
}
