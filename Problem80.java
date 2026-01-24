class Problem80 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static Node invert(Node r){
        if(r==null) return null;
        Node l=invert(r.left);
        Node rt=invert(r.right);
        r.left=rt;
        r.right=l;
        return r;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        invert(root);
        System.out.println(root.left.data);
    }
}
