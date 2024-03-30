public class revarray {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int[] reverseArr = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            reverseArr[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
    }
}