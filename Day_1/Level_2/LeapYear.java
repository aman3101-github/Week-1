import java.util.Scanner;

public class LeapYearMultipleIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is less than 1582
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582.");
        } else {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // If divisible by 4, check if it's divisible by 100
                if (year % 100 == 0) {
                    // If divisible by 100, check if it's divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
