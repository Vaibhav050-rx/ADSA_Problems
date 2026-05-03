class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // take last row
        int[]dp=new int[n];
        for(int j =0;j<n;j++){
            dp[j]=triangle.get(n-1).get(j);
        }
        for(int i =n-2;i>=0;i--){
            for(int j =0 ;j<=i;j++){
                int down = triangle.get(i).get(j) + dp[j];
                int diag = triangle.get(i).get(j) + dp[j+1];
                dp[j]=Math.min(down,diag);
            }
        }
        return dp[0];
    }
}