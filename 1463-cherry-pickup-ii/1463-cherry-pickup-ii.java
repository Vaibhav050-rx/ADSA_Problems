class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][][]dp = new int[n][m][m];
        for(int[][]mat:dp){
            for(int[]row:mat){
                Arrays.fill(row,-1);
            }
        }
        return CollectCherry(grid,0,0,m-1,dp);
    }
    public static int CollectCherry(int[][]grid,int i,int j1,int j2,int[][][]dp){
        int n = grid.length;
        int m = grid[0].length;
        // base case
        if(j1<0||j1>=m||j2<0||j2>=m) return (int)-1e9;
        if(i==n-1){
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        // explore all 9 paths and do stuff
       
        int maxi= Integer.MIN_VALUE;
        for(int d1=-1;d1<=1;d1++){
            for(int d2=-1;d2<=1;d2++){
                int val;
                if(j1==j2){
                    val = grid[i][j1];
                }else{
                    val = grid[i][j1]+grid[i][j2];
                }
                val=val+CollectCherry(grid,i+1,j1+d1,j2+d2,dp);
                maxi = Math.max(maxi,val);
            }
        }
        return dp[i][j1][j2]=maxi;

    }
}