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



public class RemoveNthNodeFromEndofList {
    public class ListNode {
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
    // two pass: tc:o(L),sc:o(1)
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode cur = head;
//        while (cur!=null){
//            n--;
//            cur=cur.next;
//        }
//        if (n==0)head=head.next;
//        if(n<0){
//            cur=head;
//            while(n!=0){
//                n++;
//                cur = cur.next;
//
//            }
//            cur.next = cur.next.next;
//        }
//        return head;
//    }

    //two pointer tc:o(L),sc:o(1)
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head.next==null)return null;
//        ListNode left=head, right=head,pre=head;
//        for(int i=0; i<n;i++){
//            right = right.next;
//        }
//
//        while(right!=null){
//            right=right.next;
//            pre = left;
//            left=left.next;
//        }
//        if(left==head){
//            return head.next;
//        }
//        pre.next=left.next;
//        return head;
//    }

    //leetcode soln
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
