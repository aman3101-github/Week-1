import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
				// Random values between 0 and 9
                matrix[i][j] = rand.nextInt(10); 
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int cols1, int rows2, int cols2) {
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) 
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) 
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int determinant = determinant2x2(matrix);
        if (determinant == 0) {
            System.out.println("Inverse does not exist.");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int determinant = determinant3x3(matrix);
        if (determinant == 0) {
            System.out.println("Inverse does not exist.");
            return null;
        }
        
        double[][] inverse = new double[3][3];
        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / (double) determinant;
        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / (double) determinant;
        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / (double) determinant;
        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / (double) determinant;
        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / (double) determinant;
        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / (double) determinant;
        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / (double) determinant;
        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / (double) determinant;
        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / (double) determinant;
        
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display a matrix of double values
    public static void displayMatrix(double[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions from the user
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = sc.nextInt();

        // Create two random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1, rows, cols);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2, rows, cols);

        // Perform matrix addition
        int[][] sum = addMatrices(matrix1, matrix2, rows, cols);
        System.out.println("Matrix Addition:");
        displayMatrix(sum, rows, cols);

        // Perform matrix subtraction
        int[][] difference = subtractMatrices(matrix1, matrix2, rows, cols);
        System.out.println("Matrix Subtraction:");
        displayMatrix(difference, rows, cols);

        // If the matrices are square (2x2 or 3x3), perform multiplication
        if (rows == cols) {
            int[][] product = multiplyMatrices(matrix1, matrix2, rows, cols, rows, cols);
            System.out.println("Matrix Multiplication:");
            displayMatrix(product, rows, cols);
        }

        // Perform transpose of matrix 1
        int[][] transpose = transposeMatrix(matrix1, rows, cols);
        System.out.println("Matrix 1 Transpose:");
        displayMatrix(transpose, cols, rows);

        // For 2x2 and 3x3 matrices, find determinant and inverse
        if (rows == 2 && cols == 2) {
            System.out.println("Determinant of Matrix 1: " + determinant2x2(matrix1));
            double[][] inverse = inverse2x2(matrix1);
            if (inverse != null) {
                System.out.println("Inverse of Matrix 1:");
                displayMatrix(inverse, 2, 2);
            }
        } else if (rows == 3 && cols == 3) {
            System.out.println("Determinant of Matrix 1: " + determinant3x3(matrix1));
            double[][] inverse = inverse3x3(matrix1);
            if (inverse != null) {
                System.out.println("Inverse of Matrix 1:");
                displayMatrix(inverse, 3, 3);
            }
        }
    }
}
