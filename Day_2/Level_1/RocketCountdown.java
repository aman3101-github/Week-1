import java.util.Scanner;

public class RocketCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking the countdown number as the user input
        System.out.print("Enter countdown starting number: ");
        int counter = input.nextInt();
        
        while (counter > 0) {
            System.out.println("Countdown: " + counter);
            counter--;
        }
        
		// Display the result
        System.out.println("Launch!");
		
        // Closing the scanner object
        input.close();
    }
}
