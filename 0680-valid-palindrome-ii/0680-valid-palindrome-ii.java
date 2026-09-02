class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i =0;
        int j = n-1;
        while(i<j){
            char ch = s.charAt(i);
            char c = s.charAt(j);
            if(ch != c){
                return isPalindrone(s,i+1,j) || isPalindrone(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPalindrone(String s, int i ,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}