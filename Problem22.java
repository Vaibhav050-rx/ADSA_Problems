// Problem 22: WAP to rotate matrix by 90 degree
import java.util.Arrays;

class Problem22 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Problem22 sol = new Problem22();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix:");
        for(int[] row : matrix) System.out.println(Arrays.toString(row));
        sol.rotate(matrix);
        System.out.println("Matrix after 90 degree rotation:");
        for(int[] row : matrix) System.out.println(Arrays.toString(row));
    }
}