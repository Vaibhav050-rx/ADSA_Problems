// Problem 10: WAP to find first occurrence of an element
import java.util.Arrays;

class Problem10 {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 5;
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        int index = findFirstOccurrence(numbers, target);
        System.out.println("First occurrence is at index: " + index);
    }
}