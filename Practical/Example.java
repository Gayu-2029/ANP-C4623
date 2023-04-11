package ExceptionHandling;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine(); // Read user input

        // Null check before accessing or manipulating userInput
        if (userInput != null) {
            int length = userInput.length();
            System.out.println("Length of the string: " + length);
        } else {
            System.out.println("Input is null.");
        }
    }
}