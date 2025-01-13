import java.util.Scanner;

public class YoungestTallestFriend {

    // Method to find the youngest among the three friends
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
		// Initializing with Amar's name
        String youngest = "Amar"; 

        // Compare ages to find the youngest
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngest = "Anthony";
        }

        return youngest;
    }

    // Method to find the tallest among the three friends
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
		// Initializing with Amar's name
        String tallest = "Amar"; 

        // Compare heights to find the tallest
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallest = "Anthony";
        }

        return tallest;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for Amar's, Akbar's, and Anthony's ages and heights
        System.out.print("Enter Amar's age: ");
        ages[0] = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        ages[1] = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        ages[2] = input.nextInt();

        System.out.print("Enter Amar's height in meters: ");
        heights[0] = input.nextDouble();
        System.out.print("Enter Akbar's height in meters: ");
        heights[1] = input.nextDouble();
        System.out.print("Enter Anthony's height in meters: ");
        heights[2] = input.nextDouble();

        // Find and display the youngest and the tallest among the three friends
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner
        input.close();
    }
}
