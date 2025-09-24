// Problem 6: WAP to find majority element.
import java.util.Arrays;

class Problem6 {
    public static int findMajorityElement(int[] arr) {
        int count = 0;
        Integer candidate = null;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Array: " + Arrays.toString(numbers));
        int majority = findMajorityElement(numbers);
        System.out.println("The majority element is: " + majority);
    }
}