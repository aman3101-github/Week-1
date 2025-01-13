

import java.util.Scanner;
public class PowerOfNumber {
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				
				// Taking number as user input
				System.out.print("Enter the base number: ");
				int number = input.nextInt();
				
				// Taking power as user input
				System.out.print("Enter the power: ");
				int power = input.nextInt();
				
				// Creating a result variable and assigning it a value
				int result = 1;
				
				for(int i=1; i<=power; i++){
						result*= number;
					}
					
				System.out.print("The power of the " + number + " is "+ result);
					
					// Closing the scanner object 
				input.close();
				}
				
				
		}