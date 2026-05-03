class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n= grid[0].length;
        int[][]dp=new int[m][n];
        for(int i =0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return MinAns(grid,m-1,n-1,dp);

    }
    public static int MinAns(int[][]arr,int i,int j,int[][]dp){
        // base case
        if(i==0&&j==0)return arr[i][j];
        if(i<0||j<0) return (int)1e9;
        if(dp[i][j]!=-1) return dp[i][j];

        int up=arr[i][j]+ MinAns(arr,i-1,j,dp);
        int left = arr[i][j]+MinAns(arr,i,j-1,dp);

        return dp[i][j]=Math.min(up,left);

    }
    
}