// Problem 33: Codeforces problem 318/A
import java.util.Scanner;

class Problem33 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long oddCount = (n + 1) / 2;
            if (k <= oddCount) {
                System.out.println(2 * k - 1);
            } else {
                k -= oddCount;
                System.out.println(2 * k);
            }
        }
    }
}