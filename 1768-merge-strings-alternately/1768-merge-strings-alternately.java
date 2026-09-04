class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder word3 = new StringBuilder();
        int i = 0 ;
        int j = 0;
        while(i<n && j<m){
            char ch = word1.charAt(i);
            char c = word2.charAt(j);
            word3.append(ch);
            word3.append(c);
            i++;
            j++;
        }
        while(i<n){
            char ch = word1.charAt(i);
            word3.append(ch);
            i++;
        }
        while(j<m){
            char c = word2.charAt(j);
            word3.append(c);
            j++;
        }
        return word3.toString();
    }
}