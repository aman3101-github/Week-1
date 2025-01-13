import java.util.Scanner;

public class maxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
		// Calculating the maximum number of possible handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
		// Display the result 
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
		input.close();
    }
}
