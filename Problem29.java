// Problem 29: WAP for range sum query – immutable
import java.util.Arrays;

class Problem29 {
    private final int[] prefixSum;

    public Problem29(int[] nums) {
        if (nums == null || nums.length == 0) {
            prefixSum = new int[0];
            return;
        }
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (prefixSum.length == 0) {
            return 0;
        }
        if (left == 0) {
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }

    public static void main(String[] args) {
        int[] arr = {-2, 0, 3, -5, 2, -1};
        System.out.println("Array: " + Arrays.toString(arr));
        Problem29 numArray = new Problem29(arr);
        System.out.println("Sum of range [0, 2]: " + numArray.sumRange(0, 2));
        System.out.println("Sum of range [2, 5]: " + numArray.sumRange(2, 5));
    }
}