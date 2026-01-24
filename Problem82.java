import java.util.*;
class Problem82 {
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
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                if(i==n-1) System.out.print(cur.data+" ");
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
        }
    }
}
