public class Demo {
    private int x; // Instance variable
    private static int y; // Static variable
    
    public Demo(int x) {
        this.x = x; // Use of 'this' to refer to instance variable
    }
    
    public void display() {
        System.out.println("Value of x: " + this.x); // Using 'this' to access instance variable
        // System.out.println("Value of y: " + this.y); // This line will cause compilation error
        System.out.println("Value of y: " + Demo.y); // Accessing static variable using class name
    }
    
    public static void main(String[] args) {
        Demo obj = new Demo(5);
        Demo.y = 10; // Accessing static variable using class name
        obj.display();
    }
}