class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
           
        int prev = nums[0]; // dp[i-1]
        int prev2 = 0; // dp[i-2]
        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if (i > 1) take += prev2;
            int notTake = 0+ prev;
            int cur = Math.max(take, notTake);
            // shift window
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
}