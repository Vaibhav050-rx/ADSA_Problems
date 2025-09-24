// Problem 2: WAP to find second highest element in array
import java.util.Arrays;

class Problem2 {
    public static int findSecondHighest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int currentNumber : arr) {
            if (currentNumber > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = currentNumber;
            } else if (currentNumber > secondHighest && currentNumber != firstHighest) {
                secondHighest = currentNumber;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 4, 3, 50, 23, 90};
        System.out.println("Array: " + Arrays.toString(numbers));
        int secondHighest = findSecondHighest(numbers);
        System.out.println("The second highest element is: " + secondHighest);
    }
}