class Problem79 {
    static class Node{
        int data;Node left,right;
        Node(int d){ data=d; }
    }
    static int sum(Node r,int s){
        if(r==null) return 0;
        s+=r.data;
        if(r.left==null && r.right==null) return s;
        return sum(r.left,s)+sum(r.right,s);
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(sum(root,0));
    }
}
