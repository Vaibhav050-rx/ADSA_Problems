// Problem 31: Codeforces problem 231/A 
import java.util.Scanner;

class Problem31 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                int v = sc.nextInt();
                int t = sc.nextInt();
                if (p + v + t >= 2) {
                    count++;
                }
            }
            System.out.println(count);
        } 
    }
}