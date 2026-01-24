import java.util.*;
class Problem81 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(10);
        root.right=new Node(4);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean even=true;
        while(!q.isEmpty()){
            int n=q.size();
            int prev=even?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                Node cur=q.poll();
                if(even){
                    if(cur.data%2==0 || cur.data<=prev){ System.out.println(false); return; }
                    prev=cur.data;
                }else{
                    if(cur.data%2!=0 || cur.data>=prev){ System.out.println(false); return; }
                    prev=cur.data;
                }
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            even=!even;
        }
        System.out.println(true);
    }
}
