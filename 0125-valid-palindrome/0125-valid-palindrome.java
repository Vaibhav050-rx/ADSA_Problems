class Solution {
    public boolean isAlphaNum(char ch){
        if((ch >= 'a' && ch <= 'z') ||
           (ch >= 'A' && ch <= 'Z') ||
           (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            char ch = s.charAt(start);
            char c = s.charAt(end);
            if(!isAlphaNum(ch)){
                start++;
                continue;
            }
            if(!isAlphaNum(c)){
                end--;
                continue;
            }
            if(Character.toLowerCase(ch)!=Character.toLowerCase(c)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}