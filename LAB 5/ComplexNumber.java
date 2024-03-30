public class ComplexNumber {
    private double real;
    private double imaginary;
    
    // Constructor with parameters
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // Default constructor
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    
    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }
    
    // Method to display the complex number
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
    
    public static void main(String[] args) {
        // Creating complex numbers using constructors
        ComplexNumber num1 = new ComplexNumber(2.5, 3.0);
        ComplexNumber num2 = new ComplexNumber(-1.5, 4.5);
        
        // Displaying complex numbers
        System.out.println("Complex Number 1:");
        num1.display();
        System.out.println("Complex Number 2:");
        num2.display();
        
        // Adding complex numbers
        ComplexNumber sum = num1.add(num2);
        
        // Displaying the sum
        System.out.println("Sum of Complex Number 1 and Complex Number 2:");
        sum.display();
    }
}