package Algorithm;

public class SortanArray {
    // tc:O(n+m_negative+m_positive) n for length of nums,
    // m_positive and m_negatives for max absolute integer for positives and negatives;
    // sc:O(2n+m_positive+m_negative)
    public int[] sortArray(int[] nums) {
        int max = 0, min = 0;
        //find max absolute integer for positives and negatives
        for (var c : nums) {
            if (c >= 0)
                max = Math.max(max, c);
            if (c < 0)
                min = Math.min(min, c);
        }
        int[] positive = new int[max + 1];
        int[] negative = new int[-min + 1];
        // counting
        for (var c : nums) {
            if (c < 0) {
                negative[-c]++;
            } else {
                positive[c]++;
            }
        }

        //sorting
        int x = 0;
        for (int i = -min; i > 0; i--) {
            while (negative[i] > 0) {
                nums[x] = -i;
                x++;
                negative[i]--;
            }
        }
        for (int i = 0; i < max + 1; i++) {
            while (positive[i] > 0) {
                nums[x] = i;
                x++;
                positive[i]--;
            }
        }
        return nums;
    }
}
