class Problem51 {
    static class Node {
        int data;
        Node next;
        Node(int d){ data=d; }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        System.out.println(count);
    }
}
