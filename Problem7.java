// Problem 7: WAP to find leaders in an array
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem7 {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return leaders;
        }
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] numbers = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders are: " + findLeaders(numbers));
    }
}