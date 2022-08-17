package LinkedList;

public class LinkedListCycleII {
//    tc:o(n),sc:o(1)
    public ListNode detectCycle(ListNode head) {
        var slow = head;
        var fast = slow;
        boolean find = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                find = true;
                break;
            }
        }
        if (!find) {
            return null;
        } else {
            var tmp = head;
            while (true) {
                if (tmp == slow) return slow;
                tmp = tmp.next;
                slow = slow.next;
            }
        }
    }


}
