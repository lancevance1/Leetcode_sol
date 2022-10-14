package LinkedList;

public class RemoveNthNodeFromEndofList {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head.next == null) return null;
//        ListNode dum = new ListNode();
//        dum.next = head;
//        var res = dfs(dum, n);
//        return res.node.next;
//    }
//
//    class Node {
//        ListNode node;
//        int length;
//
//        Node(ListNode node,
//             int length) {
//            this.node = node;
//            this.length = length;
//        }
//    }
//
//    private Node dfs(ListNode head, int n) {
//        if (head == null) return new Node(null, 0);
//        if (head.next == null) return new Node(head, 1);
//        var next = dfs(head.next, n);
//        if (next.length == n) {
//            head.next = next.node.next;
//        } else {
//            head.next = next.node;
//        }
//        return new Node(head, next.length + 1);
//    }

//    tc:o(L),sc:o(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        while (cur != null) {
            n--;
            cur = cur.next;
        }
        if (n == 0) head = head.next;
        if (n < 0) {
            cur = head;
            while (++n != 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return head;
    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if (head.next == null) return null;
//        ListNode left = head, right = head, pre = head;
//        for (int i = 0; i < n; i++) {
//            right = right.next;
//        }
//        while (right != null) {
//            right = right.next;
//            pre = left;
//            left = left.next;
//        }
//        if (left == head) {
//            return head.next;
//        }
//        pre.next = left.next;
//        return head;
//    }
}
