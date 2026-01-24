import java.util.*;
class Problem76 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        Queue<Node> q=new LinkedList<>();
        boolean rev=false;
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                if(rev) st.push(cur.data);
                else System.out.print(cur.data+" ");
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            while(!st.isEmpty()) System.out.print(st.pop()+" ");
            rev=!rev;
        }
    }
}
