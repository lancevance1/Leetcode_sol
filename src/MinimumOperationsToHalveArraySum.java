import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumOperationsToHalveArraySum {
    // tc: o(nlog(n)), sc: o(n)
    public int halveArray(int[] nums) {
        int count = 0;
        double sum = 0;
        double reduce = 0;

        double[] doubles = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            doubles[i] = nums[i];
        }

        Queue<Double> q = new PriorityQueue(nums.length,Collections.reverseOrder());

        for (int i = 0; i < doubles.length; i++) {
            q.add(doubles[i]);
            sum += doubles[i];
        }
        sum/=2;
        for (int i = 0; i < doubles.length; i++) {
            double a =  q.poll();
            a /= 2;
            q.offer(a);
            reduce += a;
            count++;
            if (sum <= reduce) {
                return count;
            }
        }

        return count;
    }
}
