import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// Taking salary as the user input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        
		// Taking years of service as the user input
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();
        
		// Set initial bonus as zero
        double bonus = 0.0;
		
		// Calculating bonus based on years of service
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        }
        
		// Displaying the results
        System.out.println("Bonus amount: " + bonus);
        
		// closing the scanner object
        input.close();
    }
}
