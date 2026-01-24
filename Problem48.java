class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}

public class Problem48 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        int len = 1;
        ListNode tail = head;

        while (tail.next != null) {
            len++;
            tail = tail.next;
        }

        k %= len;
        if (k == 0) return head;

        tail.next = head;
        int steps = len - k;

        while (steps-- > 0)
            tail = tail.next;

        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        Problem48 obj = new Problem48();
        ListNode rotated = obj.rotateRight(head, k);

        while (rotated != null) {
            System.out.print(rotated.val + " ");
            rotated = rotated.next;
        }
    }
}
