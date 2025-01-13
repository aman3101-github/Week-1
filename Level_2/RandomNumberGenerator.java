import java.util.Random;

public class RandomNumberGenerator{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        // Generate 4-digit random numbers and store them in the array
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000);
        }

        return randomNumbers;
    }

    // Method to find average, minimum and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        // Initialize variables to find the min, max, and sum
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            // Sum all numbers
            sum += number;

            // Find the minimum and maximum numbers using Math.min() and Math.max()
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        // Calculate average
        double average = sum / (double) numbers.length;

        // Return the result as an array: average, min, max
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find the average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
