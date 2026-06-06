class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int lcs = LCS(word1, word2, n - 1, m - 1, dp);
        return n + m - 2 * lcs;
    }

    public static int LCS(String s1, String s2,int i, int j,int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] =1 + LCS(s1, s2, i - 1, j - 1, dp);
        }
        return dp[i][j] = Math.max(LCS(s1, s2, i - 1, j, dp),LCS(s1, s2, i, j - 1, dp));        
    }
}