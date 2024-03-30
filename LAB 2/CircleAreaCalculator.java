import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the area of the circle
        double area = calculateArea(radius);
        
        // Display the area of the circle
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        
        scanner.close();
    }
    
    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}