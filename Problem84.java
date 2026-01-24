import java.util.*;
class Problem84 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            double sum=0;
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                sum+=cur.data;
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            System.out.print(sum/n+" ");
        }
    }
}
