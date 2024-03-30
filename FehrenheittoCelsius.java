import java.util.Scanner;

public class FehrenheittoCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temprature In fehrenheit :");
        double fehrenheit = sc.nextDouble();
        double celsius = (fehrenheit - 32) * 5 / 9;
        System.out.println("The Answer Is :" + celsius);
    }
}