class Solution {
    public int countGoodSubstrings(String s) {
        int start = 0;
        int count = 0;
        int[] arr = new int[26];
        for(int end = 0; end < s.length(); end++) {
            // current character add
            arr[s.charAt(end) - 'a']++;
            int range = end - start + 1;
            if (range == 3) {
                // check all characters are distinct
                if (isGoodString(arr)) {
                    count++;
                }
                // remove left character
                arr[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return count;
    }
    public boolean isGoodString(int[] arr) {
        for(int freq : arr) {
            if (freq > 1) {
                return false;
            }
        }
        return true;
    }
}