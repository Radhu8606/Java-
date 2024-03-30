import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number or string
        System.out.print("Enter a number or string: ");
        String input = scanner.nextLine();
        
        // Check if the input is a palindrome
        boolean isPalindrome = checkPalindrome(input);
        
        // Display the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }
    
    // Method to check if a string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at left and right positions don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // If loop completes without returning false, it's a palindrome
    }
}