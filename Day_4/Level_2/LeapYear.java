import java.util.Scanner;

public class LeapYear {

    // Method to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582
        if (year >= 1582) {
            // Leap year is divisible by 4 but not divisible by 100, or divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; // It's a leap year
            } else {
                return false; // Not a leap year
            }
        } else {
            // If the year is less than 1582, return false 
            return false;
        }
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Calling the method to check if the year is a leap year
        boolean leapYear = isLeapYear(year);

        // Displaying the result
        if (leapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Closing the scanner object
        input.close();
    }
}
