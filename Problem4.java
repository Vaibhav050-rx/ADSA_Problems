// Problem 4: WAP to remove duplicates from sorted array
import java.util.Arrays;

class Problem4 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        int newLength = removeDuplicates(numbers);
        System.out.println("New length of array with unique elements: " + newLength);
        System.out.print("Array with unique elements: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + (i == newLength - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}