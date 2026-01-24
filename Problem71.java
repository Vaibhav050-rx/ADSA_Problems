class Problem71 {
    static class Node {
        int data;
        Node left,right;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(root.data);
    }
}
