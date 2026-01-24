class Problem55 {
    static class Node{
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node dummy=new Node(0);
        Node head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(3);
        dummy.next=head;
        Node prev=dummy;
        while(head!=null){
            while(head.next!=null && head.data==head.next.data)
                head=head.next;
            if(prev.next==head)
                prev=prev.next;
            else
                prev.next=head.next;
            head=head.next;
        }
        Node res=dummy.next;
        while(res!=null){
            System.out.print(res.data+" ");
            res=res.next;
        }
    }
}
