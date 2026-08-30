class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int n  = intervals.length;
        if(n<=1) return intervals ;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[]curr= intervals[0];
        for(int i =1;i<n;i++){
            int[]next=intervals[i];
            if(curr[1]>=next[0]){
                curr[1] = Math.max(curr[1],next[1]);
            }else{
                result.add(curr);
                curr = next; 
            }
        }
        
        result.add(curr);
        return result.toArray(new int[result.size()][]);
    }
    
}