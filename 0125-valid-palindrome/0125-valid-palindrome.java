class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n = s.length();
        int i =0;
        int j = n-1;
        while(i<j){
            char ch = s.charAt(i);
            char c = s.charAt(j);
            // if the ch is a not a letter
            if(!isChar(ch)){
                i++;
            }else if(!isChar(c)){
                j--;
            }else if(ch != c){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static boolean isChar(char ch ){
        if((ch >= 'a' && ch<='z') || (ch >='0' && ch <='9')){
            return true;
        }
        return false;
    }
}