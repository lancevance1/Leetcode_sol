package Greedy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumNumberofRefuelingStops {
    //tc:o(nlogn),sc:o(n)
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int count = 0, i = 0;
        if (stations.length == 0) return target <= startFuel ? 0 : -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (true) {
            //油量能跑完终点
            if (startFuel >= target) {
                return count;
            } else {
                //油量跑不完，先选油量最多的加一发
                if (pq.size() > 0) {
                    startFuel += pq.remove();
                    count++;
                }
            }
            //油量能覆盖的加油站
            while (i < stations.length && startFuel >= stations[i][0]) {
                pq.add(stations[i][1]);
                i++;
            }
            // 没油了，仍然跑不到终点
            if (pq.size() == 0 && startFuel < target) return -1;
        }
    }

//    https://leetcode.com/problems/minimum-number-of-refueling-stops/discuss/294025/Java-Simple-Code-Greedy
//    Let's start with an example:
//
//    Start at 0, with start fuel = 35
//    Stations = [(10, 25), (20, 12), (30,21), (40, 5), (50,3)]
//            35.......25.......12.......21.......5........3................... (fuel)
//            |--------|--------|--------|--------|--------|------------------> (stations)
//            0.......10.......20.......30........40.......50.................. (distance)
//
//    Obviously, with 0 steps, the max distance we can reach is 35.
//    The question now is with 1 steps, what is the max distance we can reach?
//
//            35.......25.......12.......21.......5........3................... (fuel)
//            |--------|--------|--------|--------|--------|------------------> (stations)
//            0.......10.......20.......30...|....40.......50.................. (distance)
//            ...............................|.................................
//            ...............................35................................ (max distance can reach after 0 step)
//
//    When we reach 35, we pass by 3 stations [10, 20, 30]. It means we can possibly refuel at these stations.
//
//    Refuel at 10: max distance = 10 + (35 - 10 + 25) = 35 + 25 = 60
//    Refuel at 20: max distance = 20 + (35 - 20 + 12) = 35 + 12 = 47
//    Refuel at 30: max distance = 30 + (35 - 30 + 21) = 35 + 21 = 56
//    We notice that apparently the max distance does not depends on the station's position, but the station's fuel.
//    Apparently, the maximum distance of k+1 steps = maximum distance of k steps + maximum fuel of stations
//    that the car has passed by (counting from the last station that makes the previous maximum distance)
//
//            35......[25]......12.......21.......5........3................... (fuel)
//            |--------|--------|--------|--------|--------|------------------> (stations)
//            0.......[10]......20.......30...|...40.......50.................. (distance)
//            ...............................|....................|............
//            ...............................35...................|............ (max distance can reach after 0 step)
//            ....................................................60........... (max distance can reach after 1 step)
//
//    When we reach 60, we reach more 2 stations [40, 50], so if :
//
//    Refuel at 20: max distance = 10 + (60-10) - (20-10) + (20-10) + 12 = 60 + 12 = 72
//    Refuel at 30: max distance = 10 + (60-10) - (30-10) + (30-10) + 21 = 60 + 21 = 81
//    Refuel at 40: max distance = 10 + (60-10) - (40-10) + (40-10) + 5 = 60 + 5 = 65
//    Refuel at 50: max distance = 10 + (60-10) - (50-10) + (50-10) + 3 = 60 + 3 = 63
//    Our guess is correct, the max distance only depends on the amount of fuel at each station. And each time,
//    we should choose the largest amount of fuel. We come up with the following code:
//
//    public int minRefuelStops(int target, int startFuel, int[][] stations) {
//        if (startFuel >= target) return 0;
//        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b-a);
//        int i = 0, n = stations.length, stops = 0, maxDistance = startFuel;
//        while (maxDistance < target) {
//            while (i < n && stations[i][0] <= maxDistance) {
//                queue.offer(stations[i++][1]);
//            }
//            if (queue.isEmpty()) return -1;
//            maxDistance += queue.poll();
//            stops++;
//        }
//        return stops;
//    }
}
