class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int []prev=new int[amount+1];
        for(int tar = 0; tar <= amount; tar++) {
            if(tar % coins[0] == 0) {
                prev[tar] = 1;
            }else {
                prev[tar]=0;
            }
        }
        for(int i =1;i<n;i++){
            int[]curr=new int[amount+1];
            for(int tar =0;tar<=amount;tar++){
                int notPick =prev[tar];
                int pick =0;
                if(coins[i]<=tar){
                    pick =curr[tar-coins[i]];
                }
                curr[tar]=pick+notPick;   
                
            }
            prev=curr; 
        }

        return prev[amount];
    }
}