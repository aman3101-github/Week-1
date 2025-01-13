// FizzBuzz using while loop 

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking the user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Loop from 1 to the given number
		int i=0;
        while (i<=number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
			i++;
        }
        
        input.close();  // Close the scanner after the loop
    }
}

