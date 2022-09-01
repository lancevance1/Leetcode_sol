package Stack;

import java.util.Stack;

public class NextGreaterElementII {
    //tc:o(n);sc:o(n)
    public int[] nextGreaterElements(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int[] helper = new int[l * 2];
        for (int i = 0; i < l; i++) {
            helper[i] = nums[i];
        }
        for (int i = l; i < helper.length; i++) {
            helper[i] = nums[i - l];
        }
        Stack<Integer> s = new Stack();
        for (int i = helper.length - 1; i > -1; i--) {
            while (s.size() != 0 && s.peek() <= helper[i]) {
                s.pop();
            }
            if (i < l) {
                res[i] = s.size() == 0 ? -1 : s.peek();
            }
            s.push(helper[i]);
        }
        return res;
    }
}
