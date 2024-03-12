//Write a Java program that includes a method divideNumbers(int numerator, int denominator) to perform division. 
//Implement exception handling to catch ArithmeticException if the denominator is zero and display an appropriate error message.

package ProjectDemoPackage;

import java.util.Scanner;

	public class divisionProgram {

	    public static void divideNumbers(int numerator, int denominator) {
	        try {
	            int result = numerator / denominator;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter numerator: ");
	        int numerator = scanner.nextInt();
	        System.out.print("Enter denominator: ");
	        int denominator = scanner.nextInt();
	        scanner.close();

	        divideNumbers(numerator, denominator);
	    }
	

}
