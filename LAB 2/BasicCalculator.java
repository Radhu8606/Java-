import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Input the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();
        
        // Perform the operation
        double result = 0.0;
        switch(operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        // Display the result
        System.out.println("Result of " + num1 + " " + operation + " " + num2 + " is: " + result);
        
        scanner.close();
    }
}