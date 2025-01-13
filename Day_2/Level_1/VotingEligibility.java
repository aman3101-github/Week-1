import java.util.Scanner;
public class VotingEligibility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
		// Taking age as the user input
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
		// Checking for the voting eligibility and displaying the result
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
		// Closing the scanner object
        scanner.close();
    }
}
