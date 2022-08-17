package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoLinkedLists {

    //分别统计两条链表的长度，差值表示非公共部分的长度差，那么让长链表的指针先走差值的步数，再齐头并进，那么如果两个指针相等则是相交的位置。
    //    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int lenA = 0, lenB = 0;
//        // 计算两条链表的长度
//        for (ListNode p = headA; p != null; p = p.next) {
//            lenA++;
//        }
//        for (ListNode q = headB; q != null; q = q.next) {
//            lenB++;
//        }
//        // 让 p 和 q 到达尾部的距离相同
//        ListNode p = headA, q = headB;
//        if (lenA > lenB) {
//            for (int i = 0; i < lenA - lenB; i++) {
//                p = p.next;
//            }
//        } else {
//            for (int i = 0; i < lenB - lenA; i++) {
//                q = q.next;
//            }
//        }
//        // 看两个指针是否会相同，p == q 时有两种情况：
//        // 1、要么是两条链表不相交，他俩同时走到尾部空指针
//        // 2、要么是两条链表相交，他俩走到两条链表的相交点
//        while (p != q) {
//            p = p.next;
//            q = q.next;
//        }
//        return p;
//    }

    //环形链表法，把其中一个list尾巴链接到另一个list的头上，然后找环的起始点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var cur = headA;
        while (cur.next != null) {
            cur = cur.next;
        }
        var end = cur;
        cur.next = headB;
        var slow = headA;
        var fast = headA;
        boolean find = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                find = true;
                break;
            }
        }
        if (!find) {
            end.next = null;
            return null;
        } else {
            slow = headA;
            while (slow != fast) {
                fast = fast.next;
                slow = slow.next;
            }
            end.next = null;
            return slow;
        }
    }

}
