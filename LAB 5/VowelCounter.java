import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        
        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to exit): ");
            String sentence = scanner.nextLine().toLowerCase();
            
            if (sentence.equals("quit")) {
                break;
            }
            
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            for (int i = 0; i < sentence.length(); i++) {
                char ch = sentence.charAt(i);
                if (ch == 'a') {
                    countA++;
                } else if (ch == 'e') {
                    countE++;
                } else if (ch == 'i') {
                    countI++;
                } else if (ch == 'o') {
                    countO++;
                } else if (ch == 'u') {
                    countU++;
                }
            }
            
            System.out.println("Count of each vowel type in the sentence:");
            System.out.println("A: " + countA);
            System.out.println("E: " + countE);
            System.out.println("I: " + countI);
            System.out.println("O: " + countO);
            System.out.println("U: " + countU);
            
            // Update total counts
            totalA += countA;
            totalE += countE;
            totalI += countI;
            totalO += countO;
            totalU += countU;
        }
        
        // Display total counts
        System.out.println("Total count of each vowel type for all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);
        
        scanner.close();
    }
}