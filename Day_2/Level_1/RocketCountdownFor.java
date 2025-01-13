import java.util.Scanner;

public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking countdown number as the user input
        System.out.print("Enter countdown starting number: ");
        int counter = input.nextInt();
        
        for (int i = counter; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        
		// Displaying the result
        System.out.println("Launch!");
        
		// Closing the scanner object
        input.close();
    }
}
