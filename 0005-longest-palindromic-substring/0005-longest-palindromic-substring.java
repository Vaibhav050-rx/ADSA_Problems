class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i =0;i<s.length();i++){
            int s1=expands(s,i,i);
            int s2 = expands(s,i,i+1);
            int maxLen=Math.max(s1,s2);
            if(maxLen>end-start){
             start = i - (maxLen - 1) / 2;
             end = i + maxLen / 2;  
            } 
        }
        return s.substring(start,end+1);
    }
    public static int expands(String s, int start ,int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;

    }
}