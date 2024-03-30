import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = convertToFahrenheitToCelsius(fahrenheit);
        
        // Display the temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);
        
        scanner.close();
    }
    
    // Method to convert Fahrenheit to Celsius
    public static double convertToFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}