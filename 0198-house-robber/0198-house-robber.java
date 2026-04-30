class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[]dp = new int [n+1];
        Arrays.fill(dp,-1);
        return MaxOpt(nums,n-1,dp);
    }
    public static int MaxOpt(int[]nums,int idx,int[]dp){
        // base case 
        if(idx==0) return nums[0];
        if(idx<0) return 0;
        // check 
        if(dp[idx]!=-1) return dp[idx];

        int pick = nums[idx]+MaxOpt(nums,idx-2,dp);
        int NotPick =0+MaxOpt(nums,idx-1,dp);
        dp[idx]=Math.max(pick,NotPick);
        return dp[idx];
    }
}