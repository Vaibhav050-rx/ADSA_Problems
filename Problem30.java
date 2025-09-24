// Problem 30: WAP to find pivot element
import java.util.Arrays;

class Problem30 {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Problem30 sol = new Problem30();
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Pivot index is: " + sol.pivotIndex(arr));
    }
}