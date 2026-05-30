class Solution {
    public int beautySum(String s) {
        int totalBeauty=0;
        for(int i =0;i<s.length();i++){
            int[]freq=new int[26];
            for(int j =i;j<s.length();j++){
                char ch = s.charAt(j);
                freq[ch-'a']++;
                int max=0;
                int min=Integer.MAX_VALUE;
                for(int k =0;k<26;k++){
                    if(freq[k]>max) max=freq[k];
                    if(freq[k]<min && freq[k]!=0) min = freq[k];
                }
                totalBeauty +=(max-min);
            }
        }
        return totalBeauty;
    }
}