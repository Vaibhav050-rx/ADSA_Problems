class Problem77 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static Node lca(Node r,int a,int b){
        if(r==null || r.data==a || r.data==b) return r;
        Node l=lca(r.left,a,b);
        Node rt=lca(r.right,a,b);
        if(l!=null && rt!=null) return r;
        return l!=null?l:rt;
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(lca(root,2,3).data);
    }
}
