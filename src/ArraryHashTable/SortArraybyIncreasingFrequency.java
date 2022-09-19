package ArraryHashTable;

import java.util.Arrays;

public class SortArraybyIncreasingFrequency {
    //    public int[] frequencySort(int[] nums) {
//        int[] res = new int[nums.length];
//        Helper[] map = new Helper[201];
//        Arrays.fill(map, new Helper(-1, 201));
//        for (int i = 0; i < nums.length; i++) {
//            Helper h = new Helper(nums[i] + 100, 1);
//            if (map[nums[i] + 100].index != -1) {
//                h = map[nums[i] + 100];
//                h.count++;
//            }
//            map[nums[i] + 100] = h;
//        }
//        Arrays.sort(map, (a, b) -> a.count - b.count == 0 ? b.index - a.index : a.count - b.count);
//        int left = 0;
//        for (int i = 0; i < map.length; i++) {
//
//            if (map[i].index == -1) continue;
//            while (map[i].count != 0) {
//                res[left] = map[i].index - 100;
//                map[i].count--;
//                left++;
//            }
//        }
//        return res;
//    }
//
//    public class Helper {
//        int index;
//        int count;
//
//        Helper(int index, int count) {
//            this.index = index;
//            this.count = count;
//        }
//    }
    public int[] frequencySort(int[] nums) {
        // 根据范围，把所有值都➕100，转换到正数区间
        int[] cnt = new int[210];
        for (int n : nums) {
            cnt[n + 100]++;
        }
        for (int i = 0; i < nums.length; i++) {
            // 10000 ✖️ 权重 ➕ 取反后的结果
            nums[i] = 10000 * cnt[nums[i] + 100] + (100 - nums[i]);
        }
        // 排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 取模后再次取反即可还原
            nums[i] = 100 - nums[i] % 10000;
        }
        return nums;
    }
}
