
import java.util.Scanner;
public class MultipleOfNumber {
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				
				// Taking the user input for the number
				System.out.print("Enter the number: ");
				int number = input.nextInt();
				
				// Displaying the result statement
				System.out.print("Enter the number: ");
				
				if (number>=100){
					System.out.print("Enter the number below 100");
				}
				else{
					for(int i = number; i>=1; i--){
					if(number % i ==0){
				System.out.print(i + " ");
						
					}
				}
				}
				// Closing the scanner object 
				input.close();
					}
		}
