import java.util.Scanner;

public class matrixBMI {
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


        // Creating a 2D array to store height, weight, and BMI of each person
        // personData[i][0] - weight, personData[i][1] - height, personData[i][2] - BMI
        double[][] personData = new double[numberOfPersons][3];

        // Array to store the weight status of each person
        String[] weightStatus = new String[numberOfPersons];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Taking input for weight
            System.out.print("Enter weight for person " + (i + 1) + " (kg): ");
            personData[i][0] = input.nextDouble();
            
            // Validating weight input (should be positive)
            if (personData[i][0] <= 0) {
                System.err.println("Invalid weight entered. Please enter a positive number.");
                i--; // Decrease index to repeat the input for this person
                continue;
            }

            // Taking input for height
            System.out.print("Enter height for person " + (i + 1) + " (m): ");
            personData[i][1] = input.nextDouble();
            
            // Validating height input (should be positive)
            if (personData[i][1] <= 0) {
                System.err.println("Invalid height entered. Please enter a positive number.");
                i--; // Decrease index to repeat the input for this person
                continue;
            }
        }

        // Loop to calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Calculating BMI: BMI = weight / (height * height)
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determining the weight status based on BMI
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the height, weight, BMI, and weight status of each person
        System.out.println("\nDetails of the persons in the team:");
        System.out.println("  ");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Weight Status: " + weightStatus[i]);
            System.out.println("  ");
        }

        // Closing the scanner object
        input.close();
    }
}
