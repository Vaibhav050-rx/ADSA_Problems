class Problem72 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static void preorder(Node r){
        if(r==null) return;
        System.out.print(r.data+" ");
        preorder(r.left);
        preorder(r.right);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        preorder(root);
    }
}
