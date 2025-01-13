
import java.util.Scanner;

public class VotingEligibilityArray {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// Input for student's age
		System.out.println("Enter the age of 10 students: ");
		int[] studentAge = new int[10];
		for (int i = 0; i < studentAge.length; i++) {
			studentAge[i] = input.nextInt();
		}

		// Checking the voting eligibility
		for (int i = 0; i < studentAge.length; i++) {
			if (studentAge[i] < 0) {
				System.out.print(" \n" + studentAge[i] + " is an invalid age ");
			} else if (studentAge[i] >= 18) {
				System.out.print("\n The student with the age " + studentAge[i] + " can vote ");
			} else {
				System.out.print("\n The student with the age " + studentAge[i] + " cannot vote ");
			}
		}
		// Closing the input object
		input.close();

	}
}
