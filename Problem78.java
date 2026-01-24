class Problem78 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static int sum(Node r,int val){
        if(r==null) return 0;
        val=(val<<1)+r.data;
        if(r.left==null && r.right==null) return val;
        return sum(r.left,val)+sum(r.right,val);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(0);
        root.right=new Node(1);
        System.out.println(sum(root,0));
    }
}
