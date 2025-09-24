// Problem 5: WAP to remove duplicates from sorted array 2
import java.util.Arrays;

class Problem5 {
    public static int removeDuplicatesII(int[] arr) {
        if (arr.length <= 2) {
            return arr.length;
        }
        int index = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[index - 2]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        int newLength = removeDuplicatesII(numbers);
        System.out.println("New length (duplicates allowed twice): " + newLength);
        System.out.print("Modified Array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + (i == newLength - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}