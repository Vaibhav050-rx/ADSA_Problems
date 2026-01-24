class Problem73 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static void inorder(Node r){
        if(r==null) return;
        inorder(r.left);
        System.out.print(r.data+" ");
        inorder(r.right);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        inorder(root);
    }
}
