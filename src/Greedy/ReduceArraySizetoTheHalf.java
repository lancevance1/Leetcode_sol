package Greedy;

import java.util.Arrays;

public class ReduceArraySizetoTheHalf {
    //tc:o(nlogn);sc:o(n)
//    public int minSetSize(int[] arr) {
//        int len = arr.length;
//        int size = (int) 1e5 + 1;
//        Integer[] m = new Integer[size];
//        Arrays.fill(m, 0);
//        for (int i = 0; i < arr.length; i++) {
//            m[arr[i]]++;
//        }
//        Arrays.sort(m, (x, y) -> (y - x));
//
//        int x = 0;
//        for (int i = 0; i < size; i++) {
//            x += m[i];
//            if (len <= x * 2) {
//                return i + 1;
//            }
//        }
//        return 1;
//    }

    //tc:o(n);sc:o(n)
    public int minSetSize(int[] arr) {
        int len = arr.length;
        int size = (int) 1e5 + 1;
        int[] m = new int[size];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            m[arr[i]]++;
            max = Math.max(max, m[arr[i]]);
        }
        //counting sort
        countingSort(m, max);

        int x = 0;
        for (int i = 0; i < size; i++) {
            x += m[i];
            if (len <= x * 2) {
                return i + 1;
            }
        }
        return 1;
    }

    private void countingSort(int[] m, int max) {
        int[] tmp = new int[max + 1];
        for (var c : m) {
            if (c == 0) continue;
            tmp[c]++;
        }
        int j = 0;
        for (int i = tmp.length - 1; i > -1; i--) {
            while (tmp[i] != 0) {
                m[j] = i;
                j++;
                tmp[i]--;
            }
        }
    }

    //优化版counting sort
//    public int minSetSize(int[] arr) {
//        int min = 1000000, max = 0;
//        for (int val : arr) {
//            min = Math.min(val,min);
//            max = Math.max(val,max);
//        }
//        int[] count = new int[max-min+1];
//        for (int val : arr) {
//            count[val-min]++;
//        }
//        int[] bucket = new int[arr.length+1];
//        for (int val : count) {
//            if (val != 0) bucket[val]++;
//        }
//
//        int size = 0, sum = 0;
//        final int half = arr.length>>1;
//        for (int i = arr.length; i > 0; i--) {
//            while (bucket[i]-- != 0) {
//                sum += i;
//                size++;
//                if (sum >= half) return size;
//            }
//        }
//        return 0;
//    }
}
