package DynamicProgramming;

import java.util.Arrays;

public class CountVowelsPermutation {
    //tc:O(n);sc:O(1)
    public int countVowelPermutation(int n) {
        long[] arr = new long[5];
        Arrays.fill(arr, 1);
        long[] nextArr = new long[5];
        int mod = (int) 1e9 + 7;
        for (int i = 1; i < n; i++) {
            nextArr[0] = arr[1] + arr[2] + arr[4];
            nextArr[1] = arr[0] + arr[2];
            nextArr[2] = arr[1] + arr[3];
            nextArr[3] = arr[2];
            nextArr[4] = arr[2] + arr[3];
            for (int j = 0; j < 5; j++) {
                nextArr[j] %= mod;
                arr[j] = nextArr[j];
            }
        }
        int sum = 0;
        for (int j = 0; j < 5; j++) {
            sum += arr[j];
            sum %= mod;
        }
        return sum;
    }
}
