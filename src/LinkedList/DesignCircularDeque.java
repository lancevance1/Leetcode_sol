package LinkedList;

//double linked list method
public class DesignCircularDeque {
    int size;
    ListNode head;
    ListNode tail;
    int curSize;
    public DesignCircularDeque(int k) {
        if (k < 1) return;
        this.size = k;
        this.curSize = 0;
    }

    public boolean insertFront(int value) {
        if (curSize == size) return false;
        if (this.isEmpty()) {
            head = new ListNode(value);
            head.next = head;
            head.pre = head;
            tail = head;

        } else if (curSize == 1) {
            var tmp = new ListNode(value);
            tmp.next = head;
            tmp.pre = tail;
            tail.pre = tmp;
            tail.next = tmp;
            head = tmp;
        } else {
            var tmp = new ListNode(value);
            tmp.next = head;
            tmp.pre = tail;
            head.pre = tmp;
            tail.next = tmp;
            head = tmp;
        }
        curSize++;
        return true;

    }

    public boolean insertLast(int value) {
        if (curSize == size) return false;
        if (this.isEmpty()) {
            this.tail = new ListNode(value);
            tail.next = tail;
            tail.pre = tail;
            head = tail;
        } else if (curSize == 1) {
            var tmp = new ListNode(value);
            tmp.next = tail;
            tmp.pre = head;
            tail.pre = tmp;
            tail.next = tmp;
            tail = tmp;
        } else {
            var tmp = tail;
            this.tail = new ListNode(value);
            tail.next = head;
            tail.pre = tmp;
            tmp.next = tail;
            head.pre = tail;
        }
        curSize++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (curSize == 1) {
            head = null;
            tail = null;
        } else if (curSize > 2) {
            head = head.next;
            tail.next = head;
        } else {
            head = head.next;
            tail.next = head;
            tail.pre = head;
        }
        curSize--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (curSize == 1) {
            head = null;
            tail = null;
        } else if (curSize > 2) {
            tail = tail.pre;
            head.pre = tail;
        } else {
            tail = tail.pre;
            tail.next = tail;
            head.pre = tail;
        }
        curSize--;
        return true;
    }

    public int getFront() {
        if (this.isEmpty()) return -1;
        return head.val;
    }

    public int getRear() {
        if (this.isEmpty()) return -1;
        return tail.val;
    }

    public boolean isEmpty() {
        return this.curSize == 0;
    }

    public boolean isFull() {
        return this.curSize == this.size;
    }
}
