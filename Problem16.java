// Problem 16: WAP to find Maximum in rotated sorted array
import java.util.Arrays;

class Problem16 {
    public static int findMax(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low + 1) / 2; // Bias mid to the right
            if (arr[mid] < arr[low]) {
                high = mid - 1;
            } else {
                low = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Maximum element is: " + findMax(numbers));
    }
}