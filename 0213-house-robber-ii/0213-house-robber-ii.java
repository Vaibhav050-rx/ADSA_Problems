class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        if(n<2) return nums[0];
        int[] skipLastHouse=new int[n-1];
        int[] skipFirstHouse=new int[n-1];
        int n1=skipLastHouse.length;
        int n2 = skipFirstHouse.length;
        for(int i = 0;i<n-1;i++){
            skipLastHouse[i]=nums[i];
            skipFirstHouse[i]=nums[i+1];
        }
        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = MaxOpt(skipLastHouse, n1 - 1, dp1);
        int ans2 = MaxOpt(skipFirstHouse, n2 - 1, dp2);

        return Math.max(ans1,ans2);
    }
    public static int MaxOpt(int[]arr,int idx,int[]dp){
        // base case
        if(idx==0) return arr[0];
        if(idx<0) return 0;
        // check
        if(dp[idx]!=-1) return dp[idx];

        int pick =  arr[idx]+MaxOpt(arr,idx-2,dp);
        int notPick = 0+ MaxOpt(arr, idx - 1, dp);

        dp[idx]=Math.max(pick,notPick);
        return dp[idx];

    }
}