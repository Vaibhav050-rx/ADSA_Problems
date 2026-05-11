class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][]dp=new int[n][amount+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return countWays(coins,n-1,amount,dp);
        
    }
    public static int countWays(int[]arr,int i,int amount,int[][]dp){
        // base case
        if(i==0){
            if(amount % arr[0]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        int notTake=countWays(arr,i-1,amount,dp);
        int take =0;
        if(arr[i]<=amount){
            take = countWays(arr,i,amount-arr[i],dp);
        }
        return dp[i][amount]=notTake+take;
    }
}