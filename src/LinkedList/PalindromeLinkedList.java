package LinkedList;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        this.h = head;
        dfs(head);
        return res;
    }
    ListNode h;
    boolean res = true;

    private void dfs(ListNode node) {
        if (node == null) return;
        dfs(node.next);
        if (node.val != h.val) res = false;
        h = h.next;
    }

    // 1221 left:3rd node
    // 121  left:2nd node
//    public boolean isPalindrome(ListNode head) {
//        var right = head;
//        var left = head;
//        while (right != null && right.next != null) {
//            left = left.next;
//            right = right.next.next;
//        }
//        ListNode pre = null;
//        while (left != null) {
//            var tmp = left.next;
//            left.next = pre;
//            pre = left;
//            left = tmp;
//        }
//        while (pre != null) {
//            if (pre.val != head.val) return false;
//            pre = pre.next;
//            head = head.next;
//        }
//        return true;
//    }
}
