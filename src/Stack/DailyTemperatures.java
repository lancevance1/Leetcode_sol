package Stack;

import java.util.Stack;


public class DailyTemperatures {
    //tc:o(n);sc:o(n)
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<Pair> s = new Stack<>();
        for (int i = t.length - 1; i > -1; i--) {
            while (s.size() != 0 && s.peek().x <= t[i]) {
                s.pop();
            }
            res[i] = s.size() == 0 ? 0 : s.peek().y - i;
            s.push(new Pair(t[i], i));
        }
        return res;
    }

    public class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
