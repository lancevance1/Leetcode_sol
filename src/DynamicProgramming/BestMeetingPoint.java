package DynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestMeetingPoint {
    // arr =[1,0,1,0,1]
    // prefixSum=[1,1,2,2,3]
    // There are total 3 1s.
    // Firstly we calculate the distance for arr[0] is dist[0]=6.
    // if we want to get distance of arr[1], we just use prefixSum.
    // Since prefixSum[0]=1, which means left part of arr[1] has 1, and right part of arr[1] has 3-1=2;
    // So we know distance of arr[1] is
    // dist[1]  =dist[0]+the No. of 1 for left part-the No. of 1 for right part
    //          =dist[0]+1-2
    //          =5
    // Then loop each point to find minimum distance

    //tc:o(mn);sc:o(mn)
    public int minTotalDistance(int[][] grid) {
        int res = Integer.MAX_VALUE;
        int[] rowPrefixSum = new int[grid.length];
        int[] colPrefixSum = new int[grid[0].length];
        List<int[]> list = new ArrayList<>();
        int count = 0;
        //prepare rowPrefixSum
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    list.add(new int[]{i, j});
                }
            }
            rowPrefixSum[i] = count;
        }
        count = 0;
        //prepare colPrefixSum
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) count++;
            }
            colPrefixSum[j] = count;
        }
        // calculate first distance
        int rowcur = calcDist(list, 0, 0);

        // traverse all points with using prefixSum
        for (int i = 0; i < grid.length; i++) {
            if (i > 0)
                rowcur += (rowPrefixSum[i - 1] - (list.size() - rowPrefixSum[i - 1]));
            int cur = rowcur;
            for (int j = 0; j < grid[0].length; j++) {
                if (j > 0)
                    cur += 2 * colPrefixSum[j - 1] - list.size();
                res = Math.min(res, cur);
            }
        }
        return res;
    }


    private int calcDist(List<int[]> list, int row, int col) {
        int res = 0;
        for (var c : list) {
            res += Math.abs(row - c[0]) + Math.abs(col - c[1]);
        }
        return res;
    }


    //tc:o(mnlogmlogn);sc:o(mn)
//    public int minTotalDistance(int[][] grid) {
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 1) {
//                    list2.add(j);
//                    list.add(i);
//                }
//            }
//        }
//        return calcDist(list) + calcDist(list2);
//    }
//
//    private int calcDist(List<Integer> list) {
//        int res = 0;
//        Collections.sort(list);
//        int i = 0, j = list.size() - 1;
//        while (i < j) {
//            res += list.get(j) - list.get(i);
//            i++;
//            j--;
//        }
//        return res;
//    }
}
