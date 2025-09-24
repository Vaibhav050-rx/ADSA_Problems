// Problem 28: WAP to generate suffix sum aaray
import java.util.Arrays;

class Problem28 {
    public static int[] generateSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] suffixSum = generateSuffixSum(arr);
        System.out.println("Suffix Sum Array: " + Arrays.toString(suffixSum));
    }
}