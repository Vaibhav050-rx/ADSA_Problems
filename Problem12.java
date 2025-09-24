// Problem 12: WAP to find total occurrence of an element
import java.util.Arrays;

class Problem12 {
    public static int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
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

    public static int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
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

    public static int countOccurrences(int[] arr, int target) {
        int firstIndex = findFirstOccurrence(arr, target);
        if (firstIndex == -1) {
            return 0;
        }
        int lastIndex = findLastOccurrence(arr, target);
        return lastIndex - firstIndex + 1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target = 9;
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        int count = countOccurrences(numbers, target);
        System.out.println("Total occurrences: " + count);
    }
}