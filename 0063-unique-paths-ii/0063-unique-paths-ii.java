class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }
        return SumAllWays(m-1,n-1,dp,obstacleGrid);
    }

    public static int SumAllWays(int i, int j, int[][] dp,int[][]obstacleGrid) {
        // base case 
        if(i>=0&&j>=0&&obstacleGrid[i][j]==1) return 0;
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;
        if(dp[i][j]!=-1) return dp[i][j];    
        int up = SumAllWays(i - 1, j,dp,obstacleGrid);
        int left = SumAllWays(i, j - 1,dp,obstacleGrid);
        return dp[i][j]=up+left;
    }
}