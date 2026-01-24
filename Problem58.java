class Problem58 {
    static class Node{
        int data;
        Node right,down;
        Node(int d){ data=d; }
    }
    static Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        if(a.data<b.data){
            a.down=merge(a.down,b);
            return a;
        }else{
            b.down=merge(a,b.down);
            return b;
        }
    }
    public static void main(String[] args){
        Node head=new Node(5);
        head.down=new Node(7);
        head.right=new Node(10);
        Node res=merge(head,head.right);
        while(res!=null){
            System.out.print(res.data+" ");
            res=res.down;
        }
    }
}

