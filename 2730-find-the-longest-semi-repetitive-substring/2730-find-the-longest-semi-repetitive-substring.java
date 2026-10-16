class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int max=1;
        int n = s.length();
        for(int left =0;left<n;left++){
            int pc=0;
            for(int right =left+1;right<n;right++){
                if(s.charAt(right)==s.charAt(right-1)){
                    pc++;
                }
                if(pc>1) break;
                max=Math.max(max,right-left+1);
            }
        }
        return max;
    }
}