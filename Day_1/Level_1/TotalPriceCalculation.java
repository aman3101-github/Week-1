import java.util.Scanner;
public class TotalPriceCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
		// User input for unit price of product
        System.out.print("Enter unit price of the item: ");
        double unitPrice = input.nextDouble();

		// User input of the quantity of purchased product
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
		// Calculating the total purchase price of all the purchased products 
        double totalPrice = unitPrice * quantity;
        
		// Display the total purchase price 
        System.out.println("The total purchase price is INR " + totalPrice + " for quantity " + quantity + " and unit price INR " + unitPrice);
		input.close();
    }
}
