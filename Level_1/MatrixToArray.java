
import java.util.Scanner;

public class MatrixToArray {
		public static void main(String args []){
			
			// Creating the scanner object 
			Scanner input = new Scanner(System.in);
			
			// Take the user input for rows
			System.out.print("Enter the number of rows: ");
			int rows = input.nextInt();
			
			// Take the user input for columns
			System.out.print("Enter the number of columns: ");
			int columns = input.nextInt();
			
			// Creating a Matrix 
			int [] [] matrix = new int [rows] [columns]; 
			
			// Taking user input for elements of  Matrix 
				System.out.print("Enter the elements of 2-D Array");
				
				for(int i= 0; i< rows; i++){
					for(int j= 0; j< columns; j++){
						System.out.print("Enter value for [" + i + "] and [" + j + "] : \n");
						matrix[i][j] = input.nextInt();
					}
				}
				
				// Creating a 1-D array 
				int [] array =  new int [rows*columns];
				
				// Defining the index variable to track the elements in the array 
				int index = 0; 
				
				// looping through the matrix 
					for(int i=0; i<rows; i++ ){
						for( int j= 0; j<columns; j++){
							// Copying the elements of matrix to the array
							array[index] = matrix[i][j];
							// Incrementing the index to track number of elements in the array 
							index++ ; 
						}
					}
					
					// Printing the elements of array 
					System.out.print("The elements of the Matrix are: \n");
					
					for(int i=0; i<array.length; i++){
						System.out.print(array[i]+ " ");
					}
			// Closing the scanner object
				input.close();
				}
		}