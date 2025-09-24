// Problem 1: WAP to find first highest element in array
import java.util.Arrays;

class Problem1 {
    public static int findFirstHighest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }
        int maxElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 4, 3, 50, 23, 90};
        System.out.println("Array: " + Arrays.toString(numbers));
        int highest = findFirstHighest(numbers);
        System.out.println("The first highest element is: " + highest);
    }
}