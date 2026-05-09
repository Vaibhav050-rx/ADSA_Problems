class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return minJump(nums,0,dp);
    }
    public static int minJump(int[]nums,int i,int[]dp){
        int n = nums.length;
        if(i == n-1){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int mini =(int)1e8;
        for(int jump=1;jump<=nums[i];jump++){
            int nextIdx=i+jump;
            if(nextIdx<n){
                int minAns = 1+minJump(nums,nextIdx,dp);
                mini=Math.min(mini,minAns);
            }    
        }
        return dp[i]= mini;
    }
}