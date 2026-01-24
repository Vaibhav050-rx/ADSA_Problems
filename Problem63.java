class Problem63 {
    static class Node{
        int data;Node next;
        Node(int d){ data=d; }
    }
    static Node top;
    static void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }
    static void pop(){ top=top.next; }
    public static void main(String[] args){
        push(10);
        push(20);
        pop();
        System.out.println(top.data);
    }
}
