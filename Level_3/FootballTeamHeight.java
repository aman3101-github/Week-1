import java.util.Scanner;

public class FootballTeamHeight {

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] heights) {
        int sum = 0;
        // Regular for loop to iterate over the array
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        // Regular for loop to compare all heights
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        // Regular for loop to compare all heights
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an array to store the heights of 11 players
        int[] heights = new int[11];
        
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for heights of the 11 players
for (int i = 0; i < heights.length; i++) {
    while (true) {
        System.out.print("Enter height for player " + (i + 1) + ": ");
        heights[i] = input.nextInt();

        // Validating the height entered by the user
        if (heights[i] >= 150 && heights[i] <= 250) {
            break;  // Valid height, exit the loop
        } else {
            System.err.println("Please enter the height within the range of 150 - 250 cms.");
        }
    }
}



        // Calculate and display results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Sum of all players' heights: " + sum + " cm");
        System.out.println("Mean height of players: " + mean + " cm");
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");

        // Close the scanner
        input.close();
    }
}
