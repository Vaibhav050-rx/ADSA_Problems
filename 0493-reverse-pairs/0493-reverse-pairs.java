class Solution {
    public static int mergeSort(int[] arr, int start, int end) {
        if (start >=end) return 0;
        int mid = start + (end-start) / 2;
        int cnt =0;
        cnt+=mergeSort(arr, start, mid);
        cnt+=mergeSort(arr, mid + 1,end);
        cnt+=countPairs(arr,start,mid,end);
        merge(arr,start,mid,end);
        return cnt;
    }

    public static void merge(int[] arr, int start,int mid,int high) {
        List<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] > arr[j]) {
                temp.add(arr[j]);
                j++;
            }else{
                temp.add(arr[i]);
                i++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=high){
            temp.add(arr[j]);
            j++;
        }
        for(int k = 0;k<temp.size();k++){
            arr[start+k]=temp.get(k);
        }

    }
    public static int countPairs(int[] arr, int low, int mid, int high) {
    int right = mid + 1;
    int cnt = 0;
    for (int i = low; i <= mid; i++) {
        while (right <= high &&
            (long) arr[i] > 2L * arr[right]) {
            right++;
        }
        cnt += right - (mid + 1);
    }
    return cnt;
}
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}