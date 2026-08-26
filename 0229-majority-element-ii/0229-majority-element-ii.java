class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        int cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        int candidate1 = Integer.MIN_VALUE;
        int candidate2 = Integer.MIN_VALUE;

        // Find potential candidates
        for (int i = 0; i < n; i++) {

            if (nums[i] == candidate1) {
                cnt1++;
            }
            else if (nums[i] == candidate2) {
                cnt2++;
            }
            else if (cnt1 == 0 && nums[i] != candidate2) {
                candidate1 = nums[i];
                cnt1 = 1;
            }
            else if (cnt2 == 0 && nums[i] != candidate1) {
                candidate2 = nums[i];
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        // Verify candidates
        cnt1 = 0;
        cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == candidate1) {
                cnt1++;
            }

            if (nums[i] == candidate2) {
                cnt2++;
            }
        }

        if (cnt1 > n / 3) {
            ans.add(candidate1);
        }

        if (cnt2 > n / 3) {
            ans.add(candidate2);
        }

        return ans;
    }
}