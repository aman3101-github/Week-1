import java.util.Scanner;
public class ChocolateDivision {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input the number of chocolates and number of children 
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Calculate the chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the result
        System.out.println("The number of chocolates each child gets is: " + chocolatesPerChild);
        System.out.println("The number of remaining chocolates is: " + remainingChocolates);

        input.close();
    }
}
