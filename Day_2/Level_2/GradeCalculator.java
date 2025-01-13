
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
		
		// Taking user input for the marks of three subjects 
		System.out.println("Enter the Physics Marks: ");
        int PhysicsMarks = input.nextInt();
		
		System.out.println("Enter the Chemistry Marks: ");
        int ChemistryMarks = input.nextInt();
		
		System.out.println("Enter the Maths Marks: ");
        int MathsMarks = input.nextInt();
		
		// Calculate the average marks
		int totalMarks = PhysicsMarks + ChemistryMarks + MathsMarks; 
		double avgMarks = (totalMarks/3.0);
		
		if(avgMarks>=80){
			System.out.println("The average marks are "+ avgMarks + ",Grade is A "+ "and remark is Level 4, above agency-normalized standards");
		}
		else if(avgMarks>=70){
			System.out.println("The average marks are "+ avgMarks + ",Grade is B "+ "and remark is Level 3, at agency-normalized standards");
		}
		else if(avgMarks>=60){
			System.out.println("The average marks are "+ avgMarks + ",Grade is C "+ "and remark is Level 2, but approaching agency-normalized standards");
		}
		else if(avgMarks>=50){
			System.out.println("The average marks are "+ avgMarks + ",Grade is D "+ "and remark is Level 1, well below agency-normalized standards");
		}
		else if(avgMarks>=40){
			System.out.println("The average marks are "+ avgMarks + ",Grade is E "+ "and remark is Level 1, too below agency-normalized standards");
		}
		else{
			System.out.println("The average marks are "+ avgMarks + ",Grade is R "+ ", remedial standards");
		}
		// Closing the input object
		input.close();
    }
}
