public class MergeTwoSorteLists {
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

    //tc: O(m+n): sc: O(1)
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode resHead = new ListNode();
//        ListNode resTail = resHead;
//
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        resHead.next = resTail;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                resTail.next = l1;
//                l1 = l1.next;
//            } else {
//                resTail.next = l2;
//                l2 = l2.next;
//            }
//            resTail = resTail.next;
//        }
//        if (l1 == null) resTail.next = l2;
//        if (l2 == null) resTail.next = l1;
//
//        return resHead.next;
//    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-101);
        ListNode res = dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                dummy.next=list1;
                list1=list1.next;
            }else{
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        if(list1==null)dummy.next=list2;
        if(list2==null)dummy.next=list1;
        return res.next;
    }
}
