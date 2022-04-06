public class MiddleoftheLinkedList {
    // tc:o(L),sc:O(L)
    // public ListNode middleNode(ListNode head) {
    //     Map< Integer,ListNode> m = new HashMap();
    //     int i =0;
    //     while(head!=null){
    //         m.put(i,head);
    //        head= head.next;
    //             i++;
    //     }
    //     return m.get(i/2) ;
    // }

    // tc:o(L),sc:O(1)
    public ListNode middleNode(ListNode head) {
        ListNode left=head , right=head;

        while(right!=null&&right.next!=null){
            left = left.next;
            right=right.next.next;
        }
        return left ;

    }

}
