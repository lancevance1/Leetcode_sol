package LinkedList;

public class RemoveDuplicatesfromSortedList {
    // tc:O(n),sc:O(k),k is the number of distinc values
    // this solution is also valid for unsorted LinkedList
//     public ListNode deleteDuplicates(ListNode head) {
//          ListNode cur,pre=head,dummy=new ListNode(-101);
//         dummy.next=head;

//         Set<Integer> s = new HashSet();
//         if(head==null||head.next==null)return head;
//         s.add(head.val);
//         cur = head.next;

    //         while(cur!=null){
//             if(!s.contains(cur.val)){
//                 s.add(cur.val);
//                 pre=pre.next;
//             }else{
//                 pre.next=cur.next;
//             }
//             cur=cur.next;
//         }
//         return dummy.next;
//     }
    // tc:O(n),sc:O(1)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head, res = head;
        if (head == null || head.next == null) return head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return res;
    }
}
