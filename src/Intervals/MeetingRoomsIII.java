package Intervals;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        int res = 0;
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int[] rooms = new int[n];
        boolean[] used = new boolean[n];
        int offset = 0;
        PriorityQueue<Helper> pq = new PriorityQueue<>(n, (Helper a, Helper b) -> {
            if (a.end == b.end) return a.index - b.index;
            return a.end - b.end;
        });
        pq.add(new Helper(meetings[0][1], 0,meetings[0][0]));
        used[0] = true;
        rooms[0]++;
        for (int i = 1; i < meetings.length; i++) {
            while (pq.size()!=0&&meetings[i][0]  >= pq.peek().end) {
                var t = pq.poll();
                used[t.index] = false;
            }
            if (n != pq.size()) {
                int x = -1;
                for (int j = 0; j < n; j++) {
                    if (!used[j]) {
                        x = j;
                        break;
                    }

                }
                pq.add(new Helper(meetings[i][1] + offset, x,meetings[0][1]+offset));
                used[x] = true;
                rooms[x]++;
            } else {
                offset=pq.peek().end-meetings[i][0];

            }
            while (pq.size()!=0&&meetings[i][0]  >= pq.peek().end) {
                var t = pq.poll();
                used[t.index] = false;
            }

        }
        int in = -1;
        for (int i = 0; i < n; i++) {
            if (rooms[i] > res) {
                res = rooms[i];
                in = i;
            }
        }
        return in;
    }

    private class Helper {
        int end;
        int index;
        int start;
        Helper(int end, int index,int start) {
            this.end = end;
            this.index = index;
            this.start=start;
        }
    }
}
