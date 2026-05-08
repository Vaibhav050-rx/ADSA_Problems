class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        return isTrue(nums,0,dp);

    }
    public static boolean isTrue(int[]arr,int i,int[]dp){
        int n = arr.length;
        int nextIdx=0;
        int k =arr[i];
        // base case 
        if(i>=n-1) return true;
        if(dp[i]!=-1){
            return dp[i]==1;
        }
        for(int jump =1;jump<=k;jump++){
            nextIdx=i+jump;
            if(nextIdx<n){
                if(isTrue(arr,nextIdx,dp)){
                  dp[i]=1;
                   return true;
               }
            }
        }
        dp[i]=0;
        return false;
    }
}