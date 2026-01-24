class Problem53 {
    static class Node{
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        Node odd=head,even=head.next,evenHead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
