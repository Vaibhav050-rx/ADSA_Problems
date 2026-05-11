class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[]prev=new int[amount+1];
        // Base Case
        for(int tar = 0; tar <= amount; tar++) {
            if(tar % coins[0] == 0) {
                prev[tar] = tar / coins[0];
            }
            else {
                prev[tar] = (int)1e9;
            }
        }
        // Build DP Table
        for(int i = 1; i < n; i++) {
            int[]curr=new int[amount+1];
            for(int j = 0; j <= amount; j++) {
                int notTake = prev[j];
                int take = (int)1e9;
                if(coins[i] <= j) {
                    take = 1 +curr[j - coins[i]];
                }
                curr[j] =Math.min(take, notTake);
            }
            prev=curr;
        }
        int ans = prev[amount];
        if(ans >= 1e9) return -1;
        return ans;
    }
}