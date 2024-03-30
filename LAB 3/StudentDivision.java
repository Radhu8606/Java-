import java.util.Scanner;

public class StudentDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input marks for 5 subjects
        System.out.println("Enter marks for 5 subjects:");
        int totalMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + " marks: ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        // Calculate percentage
        double percentage = (double) totalMarks / 5;
        
        // Determine division based on percentage
        String division;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50 && percentage <= 59) {
            division = "Second Division";
        } else if (percentage >= 40 && percentage <= 49) {
            division = "Third Division";
        } else {
            division = "Fail";
        }
        
        // Display division
        System.out.println("Division obtained: " + division);
        
        scanner.close();
    }
}