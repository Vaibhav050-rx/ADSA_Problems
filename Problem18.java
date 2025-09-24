// Problem 18: WAP to find sqrt of a number.
class Problem18 {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        long low = 1, high = x;
        int ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            if (mid * mid < x) {
                ans = (int) mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int number = 27;
        System.out.println("The integer square root of " + number + " is: " + mySqrt(number));
    }
}