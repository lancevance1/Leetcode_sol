package AdvancedDataStrucures;

import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    PriorityQueue<Integer> leftpq;
    PriorityQueue<Integer> rightpq;

    public FindMedianfromDataStream() {
        this.leftpq = new PriorityQueue<Integer>((a, b) -> b - a);
        this.rightpq = new PriorityQueue<Integer>();
    }

    public void addNum(int num) {
        leftpq.add(num);
        rightpq.add(leftpq.poll());
        if (rightpq.size() > leftpq.size()) {
            leftpq.add(rightpq.poll());
        }

    }

    public double findMedian() {
        int leftMax = leftpq.peek();
        if (leftpq.size() == rightpq.size()) {
            int rightMin = rightpq.peek();
            return (rightMin - leftMax) * 1.0 / 2 + leftMax;
        } else {
            return leftMax;
        }
    }
}
