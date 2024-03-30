public class AverageCalculator {
    public static void main(String[] args) {
        // Create and initialize the array
        int[] numbers = {10, 20, 30, 40};

        // Calculate the sum of the elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("The average of the numbers is: " + average);
    }
}