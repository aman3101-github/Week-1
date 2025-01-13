import java.util.Scanner;
public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for salary
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
		
		// Taking user input for bonus
        System.out.print("Enter your bonus: ");
        double bonus = input.nextDouble();

        // Calculation for total income
        double totalIncome = salary + bonus;

        // Display the Output
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
		input.close();
    }
}
