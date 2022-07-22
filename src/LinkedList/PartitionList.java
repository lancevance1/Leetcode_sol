package LinkedList;

/***
 * 86. Partition List
 * Given the head of a linked list and a value x,
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 *
 * You should preserve the original relative order of the nodes in each of the two partitions.
 *
 * Example 1:
 *
 * Input: head = [1,4,3,2,5,2], x = 3
 * Output: [1,2,2,4,3,5]
 *
 * Example 2:
 *
 * Input: head = [2,1], x = 2
 * Output: [1,2]
 *
 *
 * Constraints:
 *
 * The number of nodes in the list is in the range [0, 200].
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 */
public class PartitionList {
    //tc:O(n),sc:O(1)
    public ListNode partition(ListNode head, int x) {
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();
        ListNode list1Head = list1;
        ListNode list2Head = list2;
        while (head != null) {
            ListNode headNext = head.next;
            head.next = null;
            if (head.val >= x) {
                list2.next = head;
                list2 = list2.next;
            } else {
                list1.next = head;
                list1 = list1.next;
            }
            head = headNext;
        }
        list1.next = list2Head.next;

        return list1Head.next;
    }
}
