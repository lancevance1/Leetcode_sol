package LinkedList;

public class DeleteNodeinaLinkedList {
    //tc:o(1);sc:o(1)
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
