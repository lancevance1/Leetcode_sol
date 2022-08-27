package LinkedList;

public class AddTwoNumbersII {
    //tc:o(n);sc:o(n)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count1 = 0, count2 = 0;
        ListNode h1 = l1;
        ListNode h2 = l2;
        while (l1 != null) {
            count1++;
            l1 = l1.next;
        }
        while (l2 != null) {
            count2++;
            l2 = l2.next;
        }
        ListNode res;
        l1 = h1;
        l2 = h2;
        if (count1 > count2) {
            res = h1;
        } else {
            res = h2;
        }
        if (count1 > count2) {
            while (count1 != count2) {
                l1 = l1.next;
                count1--;
            }
            while (l1 != null) {
                l1.val += l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
        } else {
            while (count1 != count2) {
                l2 = l2.next;
                count2--;
            }
            while (l1 != null) {
                l2.val += l1.val;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        int x = dfs(res);
        if (x == 1) {
            var node = new ListNode(1);
            res.val %= 10;
            node.next = res;
            res = node;
        }
        return res;
    }

    private int dfs(ListNode node) {
        if (node == null) return 0;
        int x = dfs(node.next);
        int res = 0;
        node.val += x;
        if (node.val / 10 == 1) {
            res = 1;
            node.val %= 10;
        }
        return res;
    }
}
