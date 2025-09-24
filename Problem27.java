// Problem 27: WAP to generate a prefix sum array
import java.util.Arrays;

class Problem27 {
    public static int[] generatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] prefixSum = generatePrefixSum(arr);
        System.out.println("Prefix Sum Array: " + Arrays.toString(prefixSum));
    }
}