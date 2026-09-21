class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] pFreq = new int[26];
        int[] sFreq = new int[26];
        for (int j = 0; j < p.length(); j++) {
            char c = p.charAt(j);
            pFreq[c - 'a']++;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char c = s.charAt(j);
            sFreq[ch - 'a']++;
            if (i - j + 1 == p.length()) {
                if (Arrays.equals(pFreq, sFreq)) {
                    list.add(j);
                    
                }
                sFreq[c - 'a']--;
                j++;
            }

        }
        return list;
    }
}