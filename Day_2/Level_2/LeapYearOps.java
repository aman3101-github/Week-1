
import java.util.Scanner;

public class LeapYearOps {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		// Taking user input for the year 
		System.out.println("Enter the year you want to check: ");
        int year = input.nextInt();

		// Check if the given year is greater than 1582
		if(year<1582){
				System.out.println("Enter the year greater than 1582");
		}
		else{ // IF the year is greater than 1582
				if((year%4==0 && year%100!=0) || year%400==0){
						System.out.println("Given year is a leap year");
				}
				else{
					System.out.println("Given year is not a leap year");
				}
		}
    }
}
