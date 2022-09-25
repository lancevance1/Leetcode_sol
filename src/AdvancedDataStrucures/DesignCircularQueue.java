package AdvancedDataStrucures;

public class DesignCircularQueue {
    int[] arr;
    int head;
    int tail;
    int count;

    public DesignCircularQueue(int k) {
        this.arr = new int[k];
        this.count = 0;
        this.head = 0;
        this.tail = -1;
    }

    public boolean enQueue(int value) {
        if (this.isFull()) return false;
        this.tail++;
        // this.tail%=this.arr.length;
        this.tail = this.tail == this.arr.length ? 0 : this.tail;
        this.arr[tail] = value;
        this.count++;
        return true;
    }

    public boolean deQueue() {
        if (this.isEmpty()) return false;
        this.count--;
        this.head++;
        // two ways
        // this.head%=this.arr.length; // way 1
        this.head = this.head == this.arr.length ? 0 : this.head; // way 2
        return true;
    }

    public int Front() {
        if (this.isEmpty()) return -1;
        return this.arr[head];
    }

    public int Rear() {
        if (this.isEmpty()) return -1;
        return this.arr[tail];
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == arr.length;
    }
}
