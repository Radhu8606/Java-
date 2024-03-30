import java.util.Scanner;

public class PyramidString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Print the string in pyramid form
        System.out.println("Pyramid form of the string:");
        for (int i = 0; i < inputString.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(inputString.charAt(j));
            }
            System.out.println();
        }

        scanner.close();
    }
}