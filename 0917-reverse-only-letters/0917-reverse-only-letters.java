class Solution {
    public String reverseOnlyLetters(String s) {
        char[]arr=s.toCharArray();
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            // if i is not a letter
            if(!((arr[i] >= 'A' && arr[i] <= 'Z') ||(arr[i] >= 'a' && arr[i] <= 'z'))){
                i++; // move left   
            }// j is not a letter
            else if (!((arr[j] >= 'A' && arr[j] <= 'Z') ||(arr[j] >= 'a' && arr[j] <= 'z'))){
                j--; // move 
            }// if both are letter then swap
            else{
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);    
    }
    public static void swap(char[]arr,int i ,int j){
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}