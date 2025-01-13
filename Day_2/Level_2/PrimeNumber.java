
import java.util.Scanner;
public class PrimeNumber {
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				boolean isPrime = true;
				// Taking number from user
				System.out.println("Enter a number: ");
				int number = input.nextInt();
				
				// Check for valid number
				if(number<=1){	
				System.out.println("Please enter a number greater than one");
				}
				else{
					for(int i =2; i<number; i++){
						if(number%i==0){
						 isPrime = false;
							break;
							}		
						}
			if(isPrime){
					System.out.println( number + "  is a prime number");
			}
			else{
					System.out.println(number + " is not a prime number");
			}
			      }
				  
				  // Closing the scanner object 
				  input.close();
		
		}
}
