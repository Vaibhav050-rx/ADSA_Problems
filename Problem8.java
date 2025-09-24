// Problem 8: WAP to apply linear search on array.
import java.util.Arrays;

class Problem8 {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int target = 110;
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}