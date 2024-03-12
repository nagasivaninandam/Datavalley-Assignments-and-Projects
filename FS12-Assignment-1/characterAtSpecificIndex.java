//write a java program to Replace a character at a specific index in a String in Java.


package ProjectDemoPackage;
import java.util.Scanner;

public class characterAtSpecificIndex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the original string: ");
	        String originalString = scanner.nextLine();
	        
	        System.out.print("Enter the index to replace: ");
	        int indexToReplace = scanner.nextInt();
	        
	        scanner.nextLine(); // Consume the newline character
	        
	        System.out.print("Enter the replacement character: ");
	        char replacementChar = scanner.nextLine().charAt(0);
	        
	        replaceCharAtIndexAndPrint(originalString, indexToReplace, replacementChar);
	        
	        scanner.close();
	    }
	    
	    public static void replaceCharAtIndexAndPrint(String str, int index, char replacementChar) {
	        if (index < 0 || index >= str.length()) {
	            // Index out of bounds
	            System.out.println("Index out of bounds. Original string remains unchanged.");
	            System.out.println("Original string: " + str);
	            return;
	        }
	        
	        char[] chars = str.toCharArray();
	        chars[index] = replacementChar;
	        
	        String modifiedString = new String(chars);
	        System.out.println("Original string: " + str);
	        System.out.println("Modified string: " + modifiedString);
	    }
	


}
