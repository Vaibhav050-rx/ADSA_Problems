// Problem 14: WAP to search in rotated sorted array
import java.util.Arrays;

class Problem14 {
    public static int searchInRotatedArray(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        int index = searchInRotatedArray(numbers, target);
        System.out.println("Element found at index: " + index);
    }
}