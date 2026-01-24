import java.util.*;
class Problem83 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty()){
            Node cur=q.poll();
            ans=cur.data;
            if(cur.right!=null) q.add(cur.right);
            if(cur.left!=null) q.add(cur.left);
        }
        System.out.println(ans);
    }
}
