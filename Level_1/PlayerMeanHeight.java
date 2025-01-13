
import java.util.Scanner;

public class PlayerMeanHeight {
		public static void main(String args[]){
				
				Scanner input = new Scanner(System.in);
				
				// Declaring an array of the size 11 to take user input for players' height
				double [] playerHeight = new double[11];
				
				// Declaring initial sum of heights as zero
				double sumOfHeights = 0.0;
				
				// Taking heights of players as user input
				for(int i=0; i < playerHeight.length; i++){
					System.out.print("Enter the height of player " + (i+1)+ ": ");
						playerHeight[i] = input.nextDouble();
						
					// Calculating the sum of heights of all players
						sumOfHeights = sumOfHeights + playerHeight[i];
						
				}
				
				// Calculating the mean of the heights
				double meanHeight = (sumOfHeights / playerHeight.length) ;
				
				// Displaying the results
				System.out.println("The mean height of players is " + meanHeight);
		
				// Closing the scanner object 
				input.close();
				}
		}
