// stack in node/linkedlist version
public class MinStack {
    Node root; // root is top, another name
    class Node{
        int n;
        int min;
        Node next;
        Node(int n){
            this.n = n;
        }
    }


    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        Node node = new Node(x);
        if(this.root == null){
            this.root = node;
            node.min = x;
        }else{
            Node tmp = this.root;
            this.root = node;
            node.next = tmp;
            if (node.next.min < x){
                node.min = node.next.min;
            }else{
                node.min = x;
            }
        }
    }

    public void pop() {
        if(this.root != null) {
            this.root = this.root.next;
        }
    }

    public int top() {
        int n = Integer.MIN_VALUE;
        if(this.root != null) {
            return this.root.n;
        }
        return n;
    }

    public int getMin() {
        int n = Integer.MIN_VALUE;
        if(this.root != null) {
            return this.root.min;
        }
        return n;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */