import java.util.*;
class Problem75 {
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
            Node n=q.poll();
            System.out.print(n.data+" ");
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
        }
    }
}
