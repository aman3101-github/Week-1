import java.util.Scanner;

public class SpringSeason {

    // Method to check if the given date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Check for Spring season: March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||  // April 1 to 30
            (month == 5 && day >= 1 && day <= 31) ||  // May 1 to 31
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to 20
			
            return true;
        }
			 return false;
    }

    public static void main(String[] args) {
        // Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // user input to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        //  user input to enter the day
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Validating input for month and day
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.err.println(" Please enter a valid month (1-12) and day (1-31).");
        } else {
            // Checking if the date is in Spring season
            boolean isSpring = isSpringSeason(month, day);

            // Printing the result
            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }

        // Closing the scanner object
        scanner.close();
    }

}
