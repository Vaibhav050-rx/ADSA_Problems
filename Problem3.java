// Problem 3: WAP to set zeros at the end of array
import java.util.Arrays;

class Problem3 {
    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        moveZerosToEnd(numbers);
        System.out.println("Array after moving zeros to end: " + Arrays.toString(numbers));
    }
}