class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double sum = 0;
        double avg =0;
        double maxi = Double.NEGATIVE_INFINITY;
        for(int right =0 ;right<nums.length;right++){
            sum+=nums[right];
            if(right-left+1 ==k){
                avg = sum/k;
                maxi = Math.max(maxi,avg);
                sum-=nums[left];
                left++;
            }
        }
        return maxi;
    }
}