class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] prev = new int[m];

        // base case
        for(int j=0;j<m;j++){
            prev[j] = matrix[0][j];
        }

        for(int i=1;i<n;i++){
            int[] curr = new int[m];

            for(int j=0;j<m;j++){

                int up = matrix[i][j] + prev[j];

                int LD;
                if(j>0) LD = matrix[i][j] + prev[j-1];
                else LD = (int)1e9;

                int RD;
                if(j<m-1) RD = matrix[i][j] + prev[j+1];
                else RD = (int)1e9;

                curr[j] = Math.min(up, Math.min(LD, RD));
            }

            prev = curr; // move to next row
        }

        int mini = Integer.MAX_VALUE;

        for(int j=0;j<m;j++){
            mini = Math.min(mini, prev[j]);
        }

        return mini;
    }
}