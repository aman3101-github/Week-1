import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for Amar's age and height
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
		
        System.out.print("Enter Amar's height in cms: ");
        double amarHeight = input.nextDouble();

        // Taking input for Akbar's age and height
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
		
        System.out.print("Enter Akbar's height in cms: ");
        double akbarHeight = input.nextDouble();

        // Taking input for Anthony's age and height
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
		
        System.out.print("Enter Anthony's height in cms: ");
        double anthonyHeight = input.nextDouble();

        // Finding the youngest friend manually (smallest age)
        int youngestAge = amarAge;
        String youngestFriend = "Amar";
        
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Finding the tallest friend manually (largest height)
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";
        
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cms.");

        input.close();  // Close the scanner
    }
}
