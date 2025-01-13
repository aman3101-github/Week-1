import java.util.Scanner;

public class numberCheck {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers and return 1 if number1 > number2, 0 if equal, -1 if number1 < number2
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store the 5 numbers
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check for positive/negative, even/odd
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print("Number " + (i + 1) + ": " + number + " is ");

            // Check if the number is positive, negative or zero
            String positivity = isPositive(number);
            System.out.println(positivity);

            // If the number is positive, check if it is even or odd
            if (positivity.equals("Positive")) {
                String evenOdd = isEven(number);
                System.out.println("It is " + evenOdd);
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        int comparisonResult = compare(first, last);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number");
        } else {
            System.out.println("The first number is less than the last number");
        }

        // Close the scanner object
        input.close();
    }
}
