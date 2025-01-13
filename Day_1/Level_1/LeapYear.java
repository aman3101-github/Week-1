import java.util.Scanner;
public class LeapYear{ // Leap year 366 days
		public static void main(String args[]){
			Scanner input = new Scanner();
			int year = input.Scanner();
			
			if(year<1582){
				System.out.println("Enter a year greater than 1582");
				else{
						// If the year is greater than 1582 
						if(year%4==0){
								// Check the divisibility by 100
								if(year%100==0){
									// Check the divisibility by 400
									if(year%400==0){
										System.out.println(""It is a leap year);
									}
									else{
											System.out.println("Given year is not a leap year");
									}
								}
								else{
									System.out.println("Given year is not a leap year");
								}
						}
						else{
								System.out.println("Given year is not a leap year");
						}
				}
			}
		}
}