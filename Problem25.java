// Problem 25: WAP valid suduko leetcode problem
import java.util.HashSet;
import java.util.Set;

class Problem25 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                        return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        System.out.println("This problem requires a 9x9 char[][] board as input.");
    }
}