import java.util.Random;

public class ZaraBonusCalculator {

    // Method to determine the salary and years of service randomly
    public static int[][] determineSalaryAndYearsOfService(int numEmployees) {
        Random rand = new Random();
		// 2D array to store salary and years of service
        int[][] employeeData = new int[numEmployees][2]; 

        for (int i = 0; i < numEmployees; i++) {
            // Random salary between 10000 and 99999
            employeeData[i][0] = rand.nextInt(90000) + 10000; 

            // Random years of service between 1 and 20
            employeeData[i][1] = rand.nextInt(20) + 1;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData, int numEmployees) {
        double[][] salaryAndBonus = new double[numEmployees][3]; // 2D array to store new salary and bonus

        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;

            // Calculate bonus based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            // Calculate new salary (old salary + bonus)
            double newSalary = salary + bonus;

            salaryAndBonus[i][0] = salary; // Store old salary
            salaryAndBonus[i][1] = newSalary; // Store new salary
            salaryAndBonus[i][2] = bonus; // Store bonus
        }
        return salaryAndBonus;
    }

    // Method to calculate the total old salary, new salary, and total bonus
    public static double[] calculateTotalSalariesAndBonuses(double[][] salaryAndBonus, int numEmployees) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < numEmployees; i++) {
            totalOldSalary += salaryAndBonus[i][0];
            totalNewSalary += salaryAndBonus[i][1];
            totalBonus += salaryAndBonus[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    // Method to display the results in a tabular format
    public static void displayResults(double[][] salaryAndBonus, double[] totals, int numEmployees) {
        System.out.println("  ");
        System.out.println("Employee  Old Salary     New Salary     Bonus");
        System.out.println("  ");

        // Display each employee's salary, new salary, and bonus
        for (int i = 0; i < numEmployees; i++) {
            System.out.println((i + 1) + "         " + salaryAndBonus[i][0] + "       " + salaryAndBonus[i][1] + "      " + salaryAndBonus[i][2]);
        }

        System.out.println("  ");
        // Display totals
        System.out.println("Total     " + totals[0] + "      " + totals[1] + "      " + totals[2]);
        System.out.println("  ");
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Total number of employees
        int[][] employeeData = determineSalaryAndYearsOfService(numEmployees);
        double[][] salaryAndBonus = calculateNewSalaryAndBonus(employeeData, numEmployees);
        double[] totals = calculateTotalSalariesAndBonuses(salaryAndBonus, numEmployees);

        // Display the results
        displayResults(salaryAndBonus, totals, numEmployees);
    }
}
