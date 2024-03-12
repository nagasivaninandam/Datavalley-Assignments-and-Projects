//write a java program to count the number of vowels and consonants in a given string .
package ProjectDemoPackage;
import java.util.Scanner;

public class numberOfVowelsAndConsonents {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine().toLowerCase(); // Convert the string to lowercase for case insensitivity
	        
	        int vowels = 0;
	        int consonants = 0;
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                // Check if the character is a vowel
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        
	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	        
	        scanner.close();
	    }
	

}
