class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int [][]dp=new int[n][m];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(text1,text2,0,0,dp);
        
    }
    public static int solve(String s1, String s2,int i ,int j,int[][]dp){
        int n = s1.length();
        int m = s2.length();
        if(i==n||j==m) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+solve(s1,s2,i+1,j+1,dp);
        }else{
            return dp[i][j]=Math.max(solve(s1,s2,i,j+1,dp),solve(s1,s2,i+1,j,dp));
        }
    }
}