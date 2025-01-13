import java.util.Scanner;

public class DiscountedCourseFee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // User input for the course fee
        System.out.print("Enter the fee: ");
        double fee = input.nextDouble();
		
        // User input for the discount
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();
		
        // Calculate the discounted amount
        double discountAmount = (fee * discountPercent) / 100;
		
		// Calculate the final discounted fee
        double discountedFee = fee - discountAmount;
        // Display the result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
		input.close();
    }
}
