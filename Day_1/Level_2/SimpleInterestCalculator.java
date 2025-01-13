import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking User input: Principal, Rate, and Time
        System.out.println("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.println("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.println("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);
        System.out.println("For Principal: " + principal + ", Rate of Interest: " + rate + "%, and Time: " + time + " years.");
		
        input.close();
    }
}
