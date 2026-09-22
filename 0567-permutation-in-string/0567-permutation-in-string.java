class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[]s1freq = new int[26];
        int[]s2freq = new int[26];
        for(int j =0;j<s1.length();j++){
            char c = s1.charAt(j);
            s1freq[c-'a']++;
        }
        int j =0;
        for(int i =0 ;i<s2.length();i++){
            char ch =s2.charAt(i);
            s2freq[ch-'a']++;
            if(i-j+1 == s1.length()){
                if(Arrays.equals(s1freq,s2freq)){
                    return true;
                }
                s2freq[s2.charAt(j)-'a']--;
                j++;
            }
        }
        return false;
    }
}