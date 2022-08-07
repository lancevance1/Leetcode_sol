package DynamicProgramming;

import java.util.Arrays;

public class KnightDialer {
    public int knightDialer(int n) {
        long[] arr = new long[10];
        Arrays.fill(arr, 1);
        long[] arrN = new long[10];
        int mod = (int) 1e9 + 7;
        for (int i = 1; i < n; i++) {
            arrN[0] = arr[7] + arr[5];
            arrN[1] = arr[8] + arr[6];
            arrN[2] = arr[3] + arr[7];
            arrN[3] = arr[2] + arr[9] + arr[8];
            arrN[5] = arr[0] + arr[9] + arr[6];
            arrN[6] = arr[1] + arr[5];
            arrN[7] = arr[2] + arr[0];
            arrN[8] = arr[1] + arr[3];
            arrN[9] = arr[3] + arr[5];
            for (int j = 0; j < 10; j++) {
                arrN[j] %= mod;
                arr[j] = arrN[j];
            }
        }
        int sum = 0;
        for (int j = 0; j < 10; j++) {
            sum += arr[j];
            sum %= mod;
        }
        return sum;
    }
}
