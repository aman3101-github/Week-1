 
 import java.util.Scanner;
	 public class NumberSign{
			public static void main(String args[]){
					Scanner input = new Scanner(System.in);
					
					// User Input for the numbers
					System.out.println("Enter 5 numbers : ");
					int [] number = new int[5];
						for(int i=0;i<number.length; i++){
								number[i]= input.nextInt();	
						}
						
					// Checking the sign of numbers - positive, negative, zero
						for(int i=0;i<number.length; i++){
							
							// Checking for the positive number
							if (number[i]>0){
								// Checking for even an number
								if(number[i]%2==0){
									System.out.println(number[i]+ " is an even number ");
								}
								// Checking for an odd number
								else{
									System.out.println(number[i]+ " is an odd number ");
								}
							}
							
							// Checking for negative number
							else if(number[i]<0){
								System.out.println(number[i]+ " is a negative number ");
							}
							
							// Checking if the number is zero
							else {
								System.out.println(number[i]+ " is a zero");
							}
						}
						// Closing the input object
						input.close();
					
					}
			}
