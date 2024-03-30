public class CommandLineSum {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two double numbers as command-line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double sum = num1 + num2;
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid double numbers.");
        }
    }
}