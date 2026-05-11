class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][]dp=new int[n][amount+1];
        for(int[]rows:dp){
            Arrays.fill(rows,-1);
        }
        int ans =MinCoin(coins,n-1,amount,dp);
        if(ans>=1e9) return -1;
        return ans;
    }
    public static int MinCoin(int[]arr,int i,int amount,int[][]dp){
        // base case 
        if(amount == 0) return 0;
        if(i==0){
            if(amount % arr[0]==0) return amount/arr[0];
            else return (int)1e9;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        //explore all paths
        int notPick = MinCoin(arr,i-1,amount,dp);
        int pick=Integer.MAX_VALUE;
        if(arr[i]<=amount){
            pick=1+MinCoin(arr,i,amount-arr[i],dp);
        }
        return dp[i][amount]=Math.min(pick,notPick);
    }
}