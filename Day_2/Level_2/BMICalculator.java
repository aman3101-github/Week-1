
import java.util.Scanner;
public class BMICalculator{
		public static void main(String arg[]){
				Scanner input = new Scanner(System.in);
				
				// Taking the user input for weight in kgs
				 System.out.println("Enter your weight in kgs: ");
				double weight = input.nextDouble();
				
				// Taking the user input for height in cms
				 System.out.println("Enter your height in cms: ");
				double height = input.nextDouble();
				
				// Converting height from cms to meter
				double heightMtr = height/100;
				
				// Calculating the BMI
				double BMI = weight / (heightMtr * heightMtr); 
				
				// Displaying the result 
				
					if(BMI<=18.4){
							System.out.println("Underweight");
					}
					else if(BMI<=25.0){
						System.out.println("Normal");
					}
					else if(BMI<=39.9){
						System.out.println("Overweight");
					}
					else{
						System.out.println("Obese");
						
					}
					
					// Closing the scanner object 
					input.close();
				
		}
}