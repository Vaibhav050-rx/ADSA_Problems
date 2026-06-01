class Solution {
    public static boolean isFreqSame(int [] freq1,int[]freq2){
        for(int i =0;i<26;i++){
            if(freq1[i]!=freq2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int [] freq = new int[26];
        for(int i =0;i<s1.length();i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }
        int left=0;
        int [] freq2=new int[26];
        for(int right =0;right<s2.length();right++){
            // add freq
            char c = s2.charAt(right);
            freq2[c-'a']++;
            if(right-left+1>s1.length()){
                char remove= s2.charAt(left);
                freq2[remove-'a']--;
                left++;
            }
            if(isFreqSame(freq,freq2)) return true;
        }
        return false;
    }
}