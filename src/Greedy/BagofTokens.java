package Greedy;

import java.util.Arrays;

public class BagofTokens {
    //tc:o(nlogn);sc:o(1)
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1;
        while (left <= right) {
            if (power < tokens[left]) {
                if (right == left) break;
                power += tokens[right];
                if (score == 0) return 0;
                score--;
                right--;
            } else {
                power -= tokens[left];
                score++;
                left++;
            }
        }
        return score;
    }
}
