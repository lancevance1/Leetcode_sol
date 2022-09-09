package Stack;

import java.util.Arrays;
import java.util.Stack;

public class TheNumberofWeakCharactersintheGame {
    //tc:o(nlogn);sc:o(n)
    public int numberOfWeakCharacters(int[][] p) {
        int res = 0;
        Arrays.sort(p, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });
        Stack<Integer> s = new Stack<>();
        var tmp = p[p.length - 1][0];
        s.push(p[p.length - 1][1]);
        for (int i = p.length - 1; i > -1; i--) {
            while (s.size() != 0 && s.peek() <= p[i][1]) {
                s.pop();
            }
            if (s.size() != 0) res++;
            s.push(p[i][1]);
        }
        return res;
    }
}
