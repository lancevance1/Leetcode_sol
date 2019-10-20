/**
 * Created by Lance on 10/18/2019.
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers {
    public class ListNode{
        int val;
        ListNode next = null;
        ListNode(int x){val = x;}


    }

    public int getLen(ListNode ln){
        int count = 1;
        while (ln.next != null){
            ln = ln.next;
            count++;
        }
        return count;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);

        int inc = 0;
        int v1 = l1.val;
        int v2 = l2.val;

//        if (l1.val == 0){
//            return l2;
//        }
//        if(l2.val == 0){
//            return l1;
//        }
        if(getLen(l1) > getLen((l2))){
            ln = l1;
        }else{
            ln = l2;
        }
        ListNode start = ln;
        while(ln != null) {

            if (v1 + v2 + inc < 10){
                ln.val = v1 + v2 + inc;
                inc = 0;
            }else{

                ln.val = v1 + v2 + inc - 10;
                inc = 1;

            }
            if(l1.next == null){
                v1 = 0;
            }else{
                l1 = l1.next;
                v1 = l1.val;
            }
            if (l2.next == null){
                v2 = 0;
            }else{
                l2 = l2.next;
                v2 = l2.val;
            }


            System.out.println("time"+ getLen(ln));


            if(inc == 1 && ln.next == null){
                ln.next = new ListNode(0);
            }
            ln = ln.next;


        }



        return start;
    }
}
