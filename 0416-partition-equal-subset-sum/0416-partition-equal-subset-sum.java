class Solution {
    public boolean canPartition(int[] nums) {
        int n =nums.length;
        int Tsum=0;
        for(int num:nums){
            Tsum+=num;
        }
        if (Tsum % 2 != 0) {
            return false;
        }
        int target = Tsum/2;
        int[][]dp = new int[n][target+1];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return isSum(nums, n - 1, target, dp);        
    }
    public static boolean isSum (int[]arr,int idx,int target,int[][]dp){
        int n = arr.length;
        if(target==0) return true;
        if(idx==0) return arr[0]==target;
        if(dp[idx][target]!=-1){
            return dp[idx][target]==1;
        }
        boolean notTake = isSum(arr,idx-1,target,dp);
        boolean take = false;
        if(arr[idx]<target){
            take = isSum(arr,idx-1,target-arr[idx],dp);
        }
        dp[idx][target] = (take || notTake) ? 1 : 0;
        
        return dp[idx][target]==1; 
    }
}