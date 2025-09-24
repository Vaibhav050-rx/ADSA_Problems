// Problem 11: WAP to find last occurrence of an element
import java.util.Arrays;

class Problem11 {
    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
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
        int index = findLastOccurrence(numbers, target);
        System.out.println("Last occurrence is at index: " + index);
    }
}