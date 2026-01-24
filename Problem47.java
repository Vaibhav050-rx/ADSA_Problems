class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}
public class Problem47 {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (a != null && b != null) {
            if (a.val < b.val) { cur.next = a; a = a.next; }
            else { cur.next = b; b = b.next; }
            cur = cur.next;
        }
        cur.next = (a != null) ? a : b;
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        a.next.next = new ListNode(5);
        ListNode b = new ListNode(2);
        b.next = new ListNode(4);
        b.next.next = new ListNode(6);
        Problem47 obj = new Problem47();
        ListNode merged = obj.mergeTwoLists(a, b);
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
