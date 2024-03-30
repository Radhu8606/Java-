import java.util.Scanner;

public class SecondHalfOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate the length of the string
        int length = inputString.length();

        // Print the second half of the string
        if (length >= 2) {
            int startIndexOfSecondHalf = length / 2;
            String secondHalf = inputString.substring(startIndexOfSecondHalf);
            System.out.println("Second half of the string: " + secondHalf);
        } else {
            System.out.println("String is too short to have a second half.");
        }

        scanner.close();
    }
}