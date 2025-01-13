import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking the weight in pounds as user input
        System.out.println("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert the weight from pounds to kilograms
        double weightInKgs = weightInPounds * 2.2;

        // Display the result
        System.out.println("The weight of the person in pounds is: " + weightInPounds + " and in kilograms is: " + weightInKgs);
        input.close();
    }
}
