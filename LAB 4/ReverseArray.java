public class ReverseArray {
    public static void main(String[] args) {
        // Given array
        int[] array = {1, 2, 3, 4, 5};

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}