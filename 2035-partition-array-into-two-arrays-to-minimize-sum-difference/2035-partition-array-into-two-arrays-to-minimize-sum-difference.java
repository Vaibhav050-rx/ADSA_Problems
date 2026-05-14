class Solution {

    public int minimumDifference(int[] nums) {

        int n = nums.length / 2;
        int total = 0;

        for (int x : nums) {
            total += x;
        }

        int[] left = Arrays.copyOfRange(nums, 0, n);
        int[] right = Arrays.copyOfRange(nums, n, 2 * n);

        List<Integer>[] leftSums = new ArrayList[n + 1];
        List<Integer>[] rightSums = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            leftSums[i] = new ArrayList<>();
            rightSums[i] = new ArrayList<>();
        }

        generate(left, leftSums);
        generate(right, rightSums);

        for (int i = 0; i <= n; i++) {
            Collections.sort(rightSums[i]);
        }

        int ans = Integer.MAX_VALUE;

        for (int k = 0; k <= n; k++) {

            List<Integer> lList = leftSums[k];
            List<Integer> rList = rightSums[n - k];

            for (int lSum : lList) {

                int target = total / 2 - lSum;

                int idx = Collections.binarySearch(rList, target);

                if (idx < 0) idx = -idx - 1;

                if (idx < rList.size()) {
                    int sum = lSum + rList.get(idx);
                    ans = Math.min(ans,
                            Math.abs(total - 2 * sum));
                }

                if (idx > 0) {
                    int sum = lSum + rList.get(idx - 1);
                    ans = Math.min(ans,
                            Math.abs(total - 2 * sum));
                }
            }
        }

        return ans;
    }

    private void generate(int[] arr,
                          List<Integer>[] sums) {

        int m = arr.length;

        for (int mask = 0; mask < (1 << m); mask++) {

            int cnt = 0;
            int sum = 0;

            for (int i = 0; i < m; i++) {

                if ((mask & (1 << i)) != 0) {
                    cnt++;
                    sum += arr[i];
                }
            }

            sums[cnt].add(sum);
        }
    }
}