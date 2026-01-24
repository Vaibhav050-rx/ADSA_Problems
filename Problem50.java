class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Problem50 {

    static boolean search(Node head, int key) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return true;
            curr = curr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;

        if (search(head, key))
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
