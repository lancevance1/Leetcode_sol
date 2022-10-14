package ArraryHashTable;

import java.util.Stack;

public class MaxChunksToMakeSortedII {
    //tc:o(n);sc:o(n)
//    public int maxChunksToSorted(int[] arr) {
//        int[] minArr = new int[arr.length];
//        int min = Integer.MAX_VALUE;
//        int max = -1;
//        for (int i = arr.length - 1; i > -1; i--) {
//            min = Math.min(min, arr[i]);
//            minArr[i] = min;
//        }
//        int res = 1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            max = Math.max(max, arr[i]);
//            if (max <= minArr[i + 1]) res++;
//        }
//        return res;
//    }

    //根据题目，我们可以发现，从左到右，每个分块都有一个最大值，并且这些分块的最大值呈单调递增（非严格递增）。我们可以用一个栈来存储这些分块的最大值。最后得到的栈的大小，也就是题目所求的最多能完成排序的块。
    public int maxChunksToSorted(int[] arr) {
        //stack only store maximums for each blocks, so the size of stack is the number of blocks
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() <= arr[i]) {
                stack.push(arr[i]);
            } else {
                //merge blocks if arr[i]< the max in current block
                int max = stack.pop();
                while (!stack.isEmpty() && stack.peek() > arr[i]) {
                    //keep merging blocks if arr[i]< the max in previous block
                    stack.pop();
                }
                stack.push(max);
            }
        }
        return stack.size();
    }
}
