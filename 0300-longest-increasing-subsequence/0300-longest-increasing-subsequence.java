class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][]dp=new int[n][n+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums,0,-1,dp);
    }
    public static int solve(int[]nums,int idx,int prev_idx , int[][]dp){
        int n = nums.length;
        if(idx==n) return 0;
        if(dp[idx][prev_idx+1]!=-1) return dp[idx][prev_idx+1];
        // not take 
        int notTake = solve(nums,idx+1,prev_idx,dp);
        int take =0;
        if(prev_idx==-1 || nums[idx]>nums[prev_idx]){
            take = 1+ solve(nums,idx+1,idx,dp);
        }
        return dp[idx][prev_idx+1] = Math.max(notTake,take);
    }
}