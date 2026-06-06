class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][]dp=new int[n+1][m+1];
        int lcs=LCS(word1,word2,dp);
        return n+m-2*lcs;
    }
    public static int LCS(String s1,String s2,int[][]dp){
        int n = s1.length();
        int m = s2.length();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}