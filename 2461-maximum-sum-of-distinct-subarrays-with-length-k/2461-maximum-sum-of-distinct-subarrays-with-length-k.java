import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        long sum = 0;
        long maxi = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
            if (i - j + 1 == k) {
                if (map.size() == k) {
                    maxi = Math.max(maxi, sum);
                }
                sum -= nums[j];
                int count = map.get(nums[j]);
                if (count == 1) {
                    map.remove(nums[j]);
                } else {
                    map.put(nums[j], count - 1);
                }
                j++;
            } 
        }
        return maxi;
    }
}