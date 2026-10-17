
import java.util.HashMap;

class Solution {
    public int minimumCardPickup(int[] cards) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < cards.length; i++) {

            if (map.containsKey(cards[i])) {
                int len = i - map.get(cards[i]) + 1;
                minLen = Math.min(minLen, len);
            }

            map.put(cards[i], i);
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }
}
