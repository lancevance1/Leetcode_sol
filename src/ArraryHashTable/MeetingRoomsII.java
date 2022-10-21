package ArraryHashTable;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    //    // tc:o(nlogn);sc:o(n)
//    public int minMeetingRooms(int[][] intervals) {
//        int res = 0, count = 0;
//        int[] begin = new int[intervals.length];
//        int[] end = new int[intervals.length];
//        for (int i = 0; i < intervals.length; i++) {
//            begin[i] = intervals[i][0];
//            end[i] = intervals[i][1];
//        }
//        Arrays.sort(begin);
//        Arrays.sort(end);
//        int b = 0, e = 0;
//        while (b < intervals.length && e < intervals.length) {
//            if (begin[b] < end[e]) {
//                count++;
//                b++;
//            } else if (begin[b] >= end[e]) {
//                count--;
//                e++;
//            }
//            res = Math.max(res, count);
//
//        }
//        return res;
//    }
    // tc:o(nlogn);sc:o(n)
    public int minMeetingRooms(int[][] intervals) {
        int res = 0, count = 0;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue();
        for (var c : intervals) {
            count++;
            if (pq.size() != 0 && pq.peek() <= c[0]) {
                count--;
                pq.poll();
            }
            res = Math.max(res, count);
            pq.add(c[1]);
        }
        return res;
    }
}
