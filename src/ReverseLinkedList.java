/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // TC: O(n), SC: O(1)
//    public ListNode reverseList(ListNode head) {
//        ListNode firstNode = null;
//        while (head != null){
//            ListNode tmp = head.next;
//            head.next =firstNode;
//            firstNode = head;
//            head = tmp;
//        }
//        return firstNode;
//    }
    public static ListNode traverse(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        return reverseList(head.next);
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }

        ListNode tmp = reverseList(head.next);
        tmp.next = head;
        head.next =null;
        return head;
    }


}
