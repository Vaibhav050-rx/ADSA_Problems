class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m =t.length();
        long[][]dp=new long[n+1][m+1];
        for(long[]row:dp){
            Arrays.fill(row,-1);
        }
        return (int)solve(s,t,n,m,dp);
    }
    public static long solve(String s, String t,int i,int j,long[][]dp){
        if(j==0) return 1;
        if(i==0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(s.charAt(i-1)==t.charAt(j-1)){
            dp[i][j]=solve(s,t,i-1,j-1,dp)+solve(s,t,i-1,j,dp);
        }else{
            dp[i][j]=solve(s,t,i-1,j,dp);
        }
        return dp[i][j];
    }
}