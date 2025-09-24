class LinkedListProblems {

    // Problem 35: WAP to create a linked list
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Problem 36: WAP to traverse the linkedlist
    public static void traverseLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Problem 37: WAP to insert at start of linkedList
    public static ListNode insertAtStart(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        return newNode;
    }

    // Problem 38: WAP to insert at end of linkedList
    public static ListNode insertAtEnd(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) return newNode;
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Problem 39: WAP to insert at any position of linkedList
    public static ListNode insertAtPosition(ListNode head, int val, int position) {
        if (position < 1) return head;
        if (position == 1) return insertAtStart(head, val);
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) return head;
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    // Problem 40: WAP to find middle of the linkedList
    public static ListNode findMiddle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // Problem 41: WAP to check LinkedList is circular or not
    public static boolean isCircular(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
    
    // Problem 42: WAP to delete node of an LinkedList
    public static ListNode deleteNode(ListNode head, int key) {
        if (head == null) return null;
        if (head.val == key) return head.next;
        ListNode current = head;
        while (current.next != null && current.next.val != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    // Problem 43: WAP to find length of linkedList
    public static int findLength(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Problem 44: WAP to add two number leetcode problem
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    // Problem 45: WAP to add number in linkedList GFG problem
    public static ListNode addOne(ListNode head) {
        head = reverseList(head);
        ListNode current = head;
        int carry = 1;
        while (current != null && carry > 0) {
            int sum = current.val + carry;
            current.val = sum % 10;
            carry = sum / 10;
            if(current.next == null && carry > 0){
                current.next = new ListNode(carry);
                carry = 0;
            }
            current = current.next;
        }
        return reverseList(head);
    }

    // Problem 46: WAP to reverse a linkedList
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(arr);
        System.out.print("Original List: ");
        traverseLinkedList(head);
        
        System.out.println("Length: " + findLength(head));
        
        head = insertAtStart(head, 0);
        System.out.print("After inserting 0 at start: ");
        traverseLinkedList(head);
        
        head = insertAtEnd(head, 6);
        System.out.print("After inserting 6 at end: ");
        traverseLinkedList(head);
        
        head = insertAtPosition(head, 99, 4);
        System.out.print("After inserting 99 at position 4: ");
        traverseLinkedList(head);

        head = deleteNode(head, 99);
        System.out.print("After deleting 99: ");
        traverseLinkedList(head);

        System.out.println("Middle element is: " + findMiddle(head).val);
        
        System.out.print("Reversed list: ");
        head = reverseList(head);
        traverseLinkedList(head);

        // Example for Add Two Numbers
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
        System.out.print("Adding l1 and l2: ");
        traverseLinkedList(addTwoNumbers(l1, l2));

        // Example for Add One
        ListNode numList = createLinkedList(new int[]{1, 9, 9});
        System.out.print("Adding 1 to 199: ");
        traverseLinkedList(addOne(numList));
    }
}