class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode nn = new ListNode(0);
        nn.next = head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = nn;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return nn.next;
    }
}