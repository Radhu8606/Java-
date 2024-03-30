import java.util.Scanner;

public class MaxNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        // Find the maximum number
        int max = findMax(num1, num2, num3);
        
        // Display the maximum number
        System.out.println("Maximum number is: " + max);
        
        scanner.close();
    }
    
    // Method to find the maximum number among three numbers
    public static int findMax(int a, int b, int c) {
        int max = a; // Assume first number is maximum
        
        if (b > max) {
            max = b; // Update max if second number is greater
        }
        
        if (c > max) {
            max = c; // Update max if third number is greater
        }
        
        return max;
    }
}