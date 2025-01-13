import java.util.Scanner;

public class BMIcalculator {

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        // Loop through each person's data to calculate BMI
        for (int i = 0; i < 10; i++) {
			// weight in kg
            double weight = data[i][0]; 
			// height in cm
            double heightInCm = data[i][1]; 
			// converting height from cm to meters
            double heightInM = heightInCm / 100; 

            // BMI formula: BMI = weight / (height * height)
            double bmi = weight / (heightInM * heightInM);

            // Store BMI in the third column of the 2D array
            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
		// Array to store the BMI status for each person
        String[] bmiStatus = new String[10]; 

        // Loop through each person's BMI and determine their status
        for (int i = 0; i < 10; i++) {
			// Retrieve BMI from the 2D array
            double bmi = data[i][2]; 

            if (bmi < 18.5) {
                bmiStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                bmiStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create a 2D array to store weight, height, and BMI for 10 persons
        double[][] data = new double[10][3];

        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble(); // weight in kg

            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble(); // height in cm
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Determine BMI status for each person
        String[] bmiStatus = determineBMIStatus(data);

        // Display the results with proper spacing
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            // Display person number, weight, height, BMI, and status
            System.out.println((i + 1) + "\t" + data[i][0] + "\t\t\t\t" + data[i][1] + "\t\t\t\t\t" + data[i][2] + "\t\t\t" + bmiStatus[i]);
        }

        // Close the scanner object
        input.close();
    }
}
