import java.util.Scanner;

public class calculateBMI {
    public static void main(String[] args) {
        
        // Creating scanner object to take user input
        Scanner input = new Scanner(System.in);
		
		// Declaring variable for number of persons 
			int numberOfPersons;

        // Validating user input for the number of persons (should be positive)
			while(true){
				// user input to enter the number of persons
					System.out.print("Enter the number of persons: ");
					 numberOfPersons = input.nextInt();
							if(numberOfPersons > 0){
									break;
									}
						else {
							System.err.println("Invalid number.Please enter a positive number: ");
							
								}
						}

        // Declaring arrays to store weight, height, BMI, and weight status of the persons
        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight for person " + (i + 1) + " (kg): ");
            weights[i] = input.nextDouble();
            
            // Validating weight input (positive number)
            if (weights[i] <= 0) {
                System.err.println("Invalid weight entered. Please enter a positive number.");
                i--; // Decrease the index to repeat the input for this person
                continue;
            }

            System.out.print("Enter height for person " + (i + 1) + " (m): ");
            heights[i] = input.nextDouble();
            
            // Validating height input (positive number)
            if (heights[i] <= 0) {
                System.err.println("Invalid height entered. Please enter a positive number.");
                i--; // Decrease the index to repeat the input for this person
                continue;
            }
        }

        // Loop to calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculating BMI: BMI = weight / (height * height)
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // Determining the weight status based on BMI
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmiValues[i] >= 25 && bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the height, weight, BMI, and weight status of each person
        System.out.println("\nDetails of the persons in the team:");
        System.out.println(" ");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + heights[i] + " m");
            System.out.println("Weight: " + weights[i] + " kg");
            System.out.println("BMI: " + bmiValues[i]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println(" ");
        }

        // Closing the scanner object
        input.close();
    }
}
