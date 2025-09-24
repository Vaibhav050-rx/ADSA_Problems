// Problem 32: Codeforces problem 4/A
import java.util.Scanner;

class Problem32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int w = sc.nextInt();
            if (w > 2 && w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}