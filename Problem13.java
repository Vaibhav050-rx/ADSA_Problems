// Problem 13: WAP to find Peak element from array
import java.util.Arrays;

class Problem13 {
    public static int findPeakElement(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 20, 4, 1, 0};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("A peak element is: " + findPeakElement(numbers));
    }
}