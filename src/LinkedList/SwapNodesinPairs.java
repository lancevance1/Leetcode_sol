package LinkedList;

public class SwapNodesinPairs {
    // tc:o(n);sc:o(1)
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        var pre = dummy;
        if (head == null) return null;
        if (head.next == null) return head;
        var cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            var tmp = pre;
            var tmp1 = cur.next;
            var tmp2 = cur.next.next;
            var tmp3 = tmp2.next;
            tmp1.next = null;
            tmp2.next = tmp1;
            tmp1.next = tmp3;
            tmp.next = tmp2;
            pre = tmp1;
            cur = pre;
        }
        return dummy.next;
    }
}
