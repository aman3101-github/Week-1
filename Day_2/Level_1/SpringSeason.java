import java.util.Scanner;

public class SpringSeason{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the command line
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        // Validate the month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        } else {
            // Taking the user input for the day
            System.out.print("Enter the day (1-31): ");
            int day = scanner.nextInt();

            // Validating the day input
            if (day < 1 || day > 31) {
                System.out.println("Invalid day! Please enter a value between 1 and 31.");
            } else {
                // Check if the date falls in the spring season
                boolean isSpring = false;
                if ((month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
                    (month == 4 && day >= 1 && day <= 30) ||  // April (entire month)
                    (month == 5 && day >= 1 && day <= 31) ||  // May (entire month)
                    (month == 6 && day >= 1 && day <= 20)) {  // June 1 to June 20
                    isSpring = true;
                }

                // Print the result
                if (isSpring) {
                    System.out.println("It's a Spring Season.");
                } else {
                    System.out.println("Not a Spring Season.");
                }
            }
        }

        // Close the scanner object
        scanner.close();
    }
}
