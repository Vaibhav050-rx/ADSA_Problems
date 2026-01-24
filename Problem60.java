import java.util.*;
class Problem60 {
    public static void main(String[] args){
        String s="(){}[]";
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[') st.push(c);
            else{
                if(st.isEmpty()){ System.out.println(false); return; }
                char t=st.pop();
                if(c==')'&&t!='('||c=='}'&&t!='{'||c==']'&&t!='['){
                    System.out.println(false); return;
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
