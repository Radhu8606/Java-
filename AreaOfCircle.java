import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    // get input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius of the circle: ");
    double radius = scanner.nextDouble();
    
    // calculate area
    double area = Math.PI * (radius * radius);

    // print the result
    System.out.println("The area of the circle is " + area);
  }
}