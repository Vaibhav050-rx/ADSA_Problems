// Problem 17: WAP to find how many times an array has been rotated
import java.util.Arrays;

class Problem17 {
    public static int countRotations(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        if (arr[low] <= arr[high]) return 0; // Already sorted
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }
            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Array has been rotated " + countRotations(numbers) + " times.");
    }
}