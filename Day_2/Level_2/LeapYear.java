import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		// Taking user input for the year
		
		System.out.println("Enter the year you want to check: ");
        int year = input.nextInt();

        // Check if the year is valid (greater than 1582)
        if (year < 1582) {
            System.out.println("Enter a year greater than 1582");
        } else {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // Check if the year is divisible by 100
                if (year % 100 == 0) {
                    // Check if the year is divisible by 400
                    if (year % 400 == 0) {
                        System.out.println("Given year is a leap year");
                    } else {
                        System.out.println("Given year is not a leap year");
                    }
                } else {
                    System.out.println("Given year is a leap year");
                }
            } else {
                System.out.println("Given year is not a leap year");
            }
        }
		// Closing the input object 
		input.close();
    }
}
