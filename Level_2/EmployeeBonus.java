import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Declaring the arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // Declaring the arrays to store new salary and bonus amounts
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        // Declaring variables to accumulate total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Define bonus percentages for 5% and 2%
        double bonusFivePercent = 5.0 / 100;
        double bonusTwoPercent = 2.0 / 100;

        // Loop to take input for salary and years of service for each employee
        for (int i = 0; i < salary.length; i++) {
            // Taking user input for salary of employees
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            // Taking user input for years of service of employees
            System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            // Input validation loop for salary and years of service
            while (true) {
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    break; // Exit loop if valid input
                } else {
                    System.err.println("Invalid input. Please enter a salary greater than zero and years of service as a non-negative number.");
                    // Prompt user again for input
                    System.out.print("Enter the salary of employee " + (i + 1) + ": ");
                    salary[i] = input.nextDouble();
                    System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
                    yearsOfService[i] = input.nextDouble();
                }
            }
        }

        // Loop to calculate bonus, new salary, and accumulate totals for each employee
        for (int i = 0; i < salary.length; i++) {
            // Calculating bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = bonusFivePercent * salary[i]; // 5% bonus for service > 5 years
            } else {
                bonus[i] = bonusTwoPercent * salary[i]; // 2% bonus for service <= 5 years
            }

            // Calculating new salary by adding the bonus
            newSalary[i] = salary[i] + bonus[i];

            // Calculating total bonus, total old salary, and total new salary
            totalBonus = bonus[i] + totalBonus;
            totalOldSalary = salary[i] + totalOldSalary;
            totalNewSalary = newSalary[i] + totalNewSalary;
        }

        // Printing the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Closing the scanner object
        input.close();
    }
}
