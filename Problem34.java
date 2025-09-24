// Problem 34: Codeforces problem 50/A
import java.util.Scanner;

class Problem34 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println((m * n) / 2);
        }
    }
}