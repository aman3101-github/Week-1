import java.util.Scanner;

public class Calendar {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year for February
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February has 29 days in a leap year
        }
        return days[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not by 100, unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month (using the Gregorian Calendar Algorithm)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }
        
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        
        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");  // 4 spaces for indentation
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();  // Move to next line after Saturday
            }
        }

        System.out.println();  // Ensure there is a new line after the calendar
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        // Close the scanner
        input.close();
    }
}
