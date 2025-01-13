
import java.util.Scanner;

public class EvenOddArray {
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				
				// Taking number as user input
				System.out.print("Enter the number: ");
				int number = input.nextInt();
				
				
      // Validate the user input number, if not a natural number, state invalid and exit 
      if (number <= 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
      }
				// Creating an integer array of even number
					int [] evenNumber = new int[(number/2)+1];
					
				// Creating an integer array of odd number
					int [] oddNumber = new int[(number/2)+1];
					
				// Creating index variables for even and odd arrays
					int evenIndex = 0;
					int oddIndex = 0; 
				
				// Storing the even and odd elements in their respective arrays
				for(int i =1; i<=number; i++){
						if(i % 2 ==0){
							evenNumber[evenIndex] = i;
							evenIndex++ ; 
						}
						else{
							oddNumber[oddIndex] = i;
							oddIndex++ ; 
						}
				}
				
					// Printing the even array 
					System.out.println("The even numbers between 1 and " + number + " are : ");
					for (int i = 0; i< evenIndex; i++){
							System.out.print(evenNumber[i] + " ");
						}
						
					// Printing the odd array 
					System.out.println("The odd numbers between 1 and " + number + " are : ");
					for (int j = 0; j< evenIndex; j++){
							System.out.print(oddNumber[j] + " ");
						}
				    
					// Closing the scanner object 
					input.close();
		}
		
		}
