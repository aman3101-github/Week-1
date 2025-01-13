
import java.util.Scanner;
public class FactorsOfNumber {
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				
				// Taking number as user input
				System.out.print("Enter the number: ");
				int number = input.nextInt();
				
				System.out.print("The factors of the number are: ");
				for(int i = 1; i < number; i++){
						if(number % i == 0){
				System.out.print(i+ " ");
								
						}
					}
					
					// Closing the scanner object 
				input.close();
				}
				
				
		}