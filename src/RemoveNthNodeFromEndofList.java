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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        while (cur!=null){
            n--;
            cur=cur.next;
        }
        if (n==0)head=head.next;
        if(n<0){
            cur=head;
            while(n!=0){
                n++;
                cur = cur.next;

            }
            cur.next = cur.next.next;
        }
        return head;
    }
}
