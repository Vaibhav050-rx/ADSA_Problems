class Problem52 {
    static class Node{
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        Node prev=null,cur=head;
        while(cur!=null){
            Node nxt=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nxt;
        }
        while(prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
    }
}
