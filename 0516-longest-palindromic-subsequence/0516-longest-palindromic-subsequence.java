class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][]dp=new int[n][n];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return palindrone(s,0,n-1,dp);
    }
    public static int palindrone(String s1,int left,int right,int[][]dp){
        int n = s1.length();
        int ans=0;
        if(left > right) return 0;
        if(left == right) return 1;
        if(dp[left][right] != -1) return dp[left][right];
        if(s1.charAt(left)==s1.charAt(right)){
            dp[left][right]=2+palindrone(s1,left+1,right-1,dp);
        }else{
            dp[left][right]=Math.max(palindrone(s1,left+1,right,dp),palindrone(s1,left,right-1,dp));
        }
        return dp[left][right];
    }
}