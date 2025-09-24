// Problem 24: WAP to generate spiral matrix
import java.util.Arrays;

class Problem24 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = num++;
                left++;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Problem24 sol = new Problem24();
        int n = 3;
        int[][] matrix = sol.generateMatrix(n);
        System.out.println("Generated " + n + "x" + n + " spiral matrix:");
        for(int[] row : matrix) System.out.println(Arrays.toString(row));
    }
}