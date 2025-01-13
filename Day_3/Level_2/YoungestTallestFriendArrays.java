/* Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends */

import java.util.Scanner; 

public class YoungestTallestFriendArrays{
		public static void main(String args[]){
		
				Scanner input = new Scanner(System.in);
				
				// Declaring and initializing array for the name of three friends 
					String [] friendNames = {"Amar", "Akbar", "Anthony"};
				
				// Assuming the youngest and tallest friends
					String youngestFriend = friendNames[0];
					String tallestFriend = friendNames[0];
			
				
				// Declaring array to user input the height
				double [] height = new double[3];
				
				// Declaring array to user input the height
				double [] age = new double [3]; 
				
				// Taking user input for height and age
				
					for(int i =0 ; i<height.length; i++){
							// Asking user to enter the height
							System.out.print("Please enter the height of " + friendNames[i] + " : ");
							height[i] = input.nextDouble();
							
							// Aking the user to enter the weight
							System.out.print("Please enter the age of " + friendNames[i]+ " : ");
							age[i] = input.nextDouble();
							}
				// Looping to find the youngest and tallest friend 
				
					for(int i =0; i<height.length - 1; i++){
							if(height[i]<height[i+1]){
								tallestFriend = friendNames[i+1];
							}
							else{
								tallestFriend = friendNames[i];
							}
							
							if(age[i]>age[i+1]){
								youngestFriend = friendNames[i+1];
							}
							else{
								youngestFriend = friendNames[i];
							}
					}
				// Printing the tallest and youngest friend
				
					System.out.print("The tallest friend is " + tallestFriend + ". ");
					System.out.print(" \n The youngest friend is " + youngestFriend + ". ");
				
				// Closing the scanner object 
					input.close();
			
				
				}
		}