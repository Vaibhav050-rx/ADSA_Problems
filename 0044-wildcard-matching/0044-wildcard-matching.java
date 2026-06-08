class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m =p.length();
        int[][]dp = new int[n][m];
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }
        return solve(s, p, n - 1, m - 1, dp);
    }
    public static boolean solve(String s, String p,int i,int j,int[][]dp){
        if (i < 0 && j < 0) return true;
        if (j < 0 && i >= 0) return false;
        if (i < 0 && j >= 0) {
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') return false;
            }
            return true;
        }
        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }
        if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'){
            if(solve(s,p,i-1,j-1,dp)){
                dp[i][j]=1;
                return true;
            }else{
                dp[i][j]=0;
                return false;
            }
        }
        if(p.charAt(j)=='*'){
            if(solve(s,p,i-1,j,dp)||solve(s,p,i,j-1,dp)){
                dp[i][j]=1;
                return true;
            }else{
                dp[i][j]=0;
                return false;
            }
        }
        dp[i][j]=0;
        return false;
    }
}