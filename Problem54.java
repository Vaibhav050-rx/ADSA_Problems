class Problem54 {
    static class Node{
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        Node cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.data==cur.next.data)
                cur.next=cur.next.next;
            else
                cur=cur.next;
        }
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}

