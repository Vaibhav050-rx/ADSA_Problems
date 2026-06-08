class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][]dp=new int [n][m];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(word1,word2,n-1,m-1,dp);
    }
    public static int solve(String s1, String s2,int i,int j ,int[][]dp){
        int n = s1.length();
        int m = s2.length();
        
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=solve(s1,s2,i-1,j-1,dp);
        }else{
            dp[i][j]=Math.min(1+solve(s1,s2,i,j-1,dp),Math.min(1+solve(s1,s2,i-1,j,dp),1+solve(s1,s2,i-1,j-1,dp)));
        }
        return dp[i][j];
    }
}