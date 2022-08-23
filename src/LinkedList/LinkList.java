package LinkedList;

public class LinkList {
    public class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data=data;
        }
    }
    Node head;
    LinkList(int data){
        this.head = new Node(data);
    }

    public void push(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head.previous = node;
        this.head = node;
    }

    public void printList(){
       Node node = this.head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public Node searchNode(int data){
        Node node =  this.head;
        while(node!=null){
            if (node.data == data){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void deleteNode(int data){
        Node node = this.searchNode(data);

        if (node.previous!=null){
            node.previous.next = node.next;
        }else{
            this.head = node.next;
        }
        if (node.next!=null){
            node.next.previous = node.previous;
        }

    }
}
