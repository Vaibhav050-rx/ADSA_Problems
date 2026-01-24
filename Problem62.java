import java.util.*;
class Problem62 {
    public static void main(String[] args){
        int[] arr={4,5,2,25};
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            System.out.print((st.isEmpty()?-1:st.peek())+" ");
            st.push(arr[i]);
        }
    }
}
