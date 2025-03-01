import java.util.Scanner;

public class CharToAscii {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        // Convert the character to its ASCII value
        int asciiValue = (int) character;
        
        // Output the ASCII value
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
        
        // Close the scanner object
        scanner.close();
    }
}
