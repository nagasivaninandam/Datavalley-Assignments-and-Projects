//Create a custom exception class in Java named CustomValidationException. Implement a method that
//takes an integer as input and throws this custom exception if the number is negative

package ProjectDemoPackage;

import java.util.Scanner;

class customValidationException extends Exception {
    public customValidationException(String message) {
        super(message);
    }
}

class Validator {
    public static void validateNumber(int number) throws customValidationException {
        if (number < 0) {
            throw new customValidationException("Number cannot be negative");
        }
    }
}

public class customValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        try {
            Validator.validateNumber(number);
            System.out.println("Number is valid.");
        } catch (customValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
}
