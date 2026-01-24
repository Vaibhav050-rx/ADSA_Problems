class Problem74 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static void postorder(Node r){
        if(r==null) return;
        postorder(r.left);
        postorder(r.right);
        System.out.print(r.data+" ");
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        postorder(root);
    }
}
