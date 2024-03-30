import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }
        
        // Parse the command line arguments as integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        
        // Calculate the sum
        int sum = num1 + num2;
        
        // Display the sum
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}