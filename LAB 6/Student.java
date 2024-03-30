public class Student {
    private int idNo;
    private int numOfSubjectsRegistered;
    private int[] subjectCode;
    private int[] subjectCredits;
    private char[] gradeObtained;
    private double spi;

    // Constructor
    public Student(int idNo, int numOfSubjectsRegistered, int[] subjectCode, int[] subjectCredits, char[] gradeObtained) {
        this.idNo = idNo;
        this.numOfSubjectsRegistered = numOfSubjectsRegistered;
        this.subjectCode = subjectCode;
        this.subjectCredits = subjectCredits;
        this.gradeObtained = gradeObtained;
        calculateSPI();
    }

    // Method to calculate SPI
    private void calculateSPI() {
        double sumCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < numOfSubjectsRegistered; i++) {
            sumCredits += subjectCredits[i];
            totalGradePoints += getGradePoints(gradeObtained[i]) * subjectCredits[i];
        }

        if (sumCredits != 0) {
            spi = totalGradePoints / sumCredits;
        } else {
            spi = 0;
        }
    }

    // Method to get grade points
    private double getGradePoints(char grade) {
        switch (grade) {
            case 'A':
                return 10;
            case 'B':
                return 8;
            case 'C':
                return 6;
            case 'D':
                return 4;
            case 'F':
                return 0;
            default:
                return 0;
        }
    }

    // Getter method for SPI
    public double getSpi() {
        return spi;
    }

    public static void main(String[] args) {
        int n = args.length / 5; // Assuming each student data requires 5 arguments

        // Instantiating an array for objects of class Student
        Student[] students = new Student[n];

        // Process data for each student
        for (int i = 0; i < n; i++) {
            int idNo = Integer.parseInt(args[i * 5]);
            int numOfSubjectsRegistered = Integer.parseInt(args[i * 5 + 1]);
            int[] subjectCode = new int[numOfSubjectsRegistered];
            int[] subjectCredits = new int[numOfSubjectsRegistered];
            char[] gradeObtained = new char[numOfSubjectsRegistered];

            // Populate subject code, subject credits, and grade obtained arrays
            for (int j = 0; j < numOfSubjectsRegistered; j++) {
                subjectCode[j] = Integer.parseInt(args[i * 5 + 2 + j * 3]);
                subjectCredits[j] = Integer.parseInt(args[i * 5 + 3 + j * 3]);
                gradeObtained[j] = args[i * 5 + 4 + j * 3].charAt(0);
            }

            // Instantiate Student object and store it in the array
            students[i] = new Student(idNo, numOfSubjectsRegistered, subjectCode, subjectCredits, gradeObtained);
        }

        // Display SPI for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + students[i].idNo + " SPI: " + students[i].getSpi());
        }
    }
}