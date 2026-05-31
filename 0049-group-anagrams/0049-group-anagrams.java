class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String freqString = getFreq(strs[i]);
            if(!mp.containsKey(freqString)){
                // make a new list 
                mp.put(freqString, new ArrayList<>());
            }
            mp.get(freqString).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
    public static String getFreq(String strs){
        int freq[] = new int[26];
        for(char ch:strs.toCharArray()){
            freq[ch-'a']++;    
        }
        StringBuilder sb= new StringBuilder();
        char ch ='a';
        for(int count:freq){
            sb.append(ch);
            sb.append(count);
            ch++;
        }
        return sb.toString();
    }
}