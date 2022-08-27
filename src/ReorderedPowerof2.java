import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReorderedPowerof2 {
    //tc:o((logn)!) x is length of n
//    public boolean reorderedPowerOf2(int n) {
//        if (n < 10) {
//            if (n == 1 || n == 2 || n == 4 || n == 8) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        int[] map = new int[10];
//        Arrays.fill(map, -1);
//        List<Integer> list = new LinkedList<>();
//        edge = new LinkedList<>();
//        int len = 0;
//        int i = 0;
//        while (n != 0) {
//            int t = n % 10;
//            map[i] = t;
//            n /= 10;
//            len++;
//            i++;
//        }
//        dfs(map, len);
//        return res;
//    }
//
//    boolean res = false;
//    LinkedList<Integer> edge;
//
//    private void dfs(int[] map, int len) {
//        if (edge.size() == len) {
//            isValid(edge);
//            return;
//        }
//        for (int i = 0; i < len; i++) {
//            if (map[i] == -1) continue;
//            var tmp = map[i];
//            map[i] = -1;
//            edge.add(tmp);
//            dfs(map, len);
//            var x = edge.removeLast();
//            map[i] = x;
//        }
//    }
//    private void isValid(List<Integer> edge) {
//        long sum = 0;
//        if (edge.get(0) == 0) return;
//        for (int i = 0; i < edge.size(); i++) {
//            sum += edge.get(i);
//            sum *= 10;
//        }
//        long t = sum / 10;
//        if ((t & (t - 1)) == 0) {
//            res = true;
//        }
//    }

    //tc:o(logn);sc:o(logn)
    public boolean reorderedPowerOf2(int N) {
        int[] A = count(N);
        for (int i = 0; i < 31; ++i)
            if (Arrays.equals(A, count(1 << i)))
                return true;
        return false;
    }

    // Returns the count of digits of N
    // Eg. N = 112223334, returns [0,2,3,3,1,0,0,0,0,0]
    public int[] count(int N) {
        int[] ans = new int[10];
        while (N > 0) {
            ans[N % 10]++;
            N /= 10;
        }
        return ans;
    }
}
