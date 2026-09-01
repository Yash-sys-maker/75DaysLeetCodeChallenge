class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Node = new ListNode(0);
        Node.next = head;

        
        ListNode fast = Node;
        ListNode slow = Node;

        
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        
        slow.next = slow.next.next;


        return Node.next;
    }
}