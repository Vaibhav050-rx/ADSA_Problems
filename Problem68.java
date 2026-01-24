class Problem68 {
    static class Node{
        int data;Node next;
        Node(int d){ data=d; }
    }
    static Node front,rear;
    static void enqueue(int x){
        Node n=new Node(x);
        if(rear==null){ front=rear=n; return; }
        rear.next=n;
        rear=n;
    }
    static void dequeue(){ front=front.next; }
    public static void main(String[] args){
        enqueue(10);
        enqueue(20);
        dequeue();
        System.out.println(front.data);
    }
}
