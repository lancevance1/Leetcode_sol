package LinkedList;

public class DeletetheMiddleNodeofaLinkedList {
        public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        var dummy = new ListNode(-1);
        dummy.next = head;
        var node = dummy.next;
        while (node != null) {
            len++;
            node = node.next;
        }
        var it = len / 2;
        var pre = dummy;
        var cur = dummy.next;
        while (it != 0) {
            pre = cur;
            cur = cur.next;
            it--;
        }
        pre.next = cur.next;
        return dummy.next;
    }
    //tc:o(n);sc:o(1)
//    public ListNode deleteMiddle(ListNode head) {
//        var dummy = new ListNode(-1);
//        dummy.next = head;
//        var pre = dummy;
//        ListNode slow = head, fast = head;
//        while (fast != null && fast.next != null) {
//            pre = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        pre.next = slow.next;
//        return dummy.next;
//    }
}
