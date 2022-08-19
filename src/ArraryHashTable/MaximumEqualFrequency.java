package ArraryHashTable;

public class MaximumEqualFrequency {
    //tc:o(n); sc:o(n)
    public int maxEqualFreq(int[] nums) {
        int len = nums.length;
        int size = (int) 1e5 + 1;
        int[] count = new int[size];
        int[] freq = new int[size];
        int max = 0; //max ocurrence of elements in input array.
        int res = 0;
        for (int i = 0; i < len; i++) {
            count[nums[i]]++;
            freq[count[nums[i]]]++;
            max = Math.max(max, count[nums[i]]);

            //all elements have appeared once, e.g. [1,2,3,4,5,6] (max == 1).
            if (max == 1) {
                res = Math.max(res, i + 1);
            } else {
                //all elements have appeared max times expect only an element appeared once,
                // e.g. [2,2,5,2,6,6,6] (max * freq[max] == i).
                if (max * freq[max] == i) res = Math.max(res, i + 1);
                //all elements have appeared max - 1 times expect only an element appeared k times
                // , e.g. [2,2,4,4,7,7,7,10,10] (leads to (max - 1) * freq[max - 1] = i).
                if ((max - 1) * freq[max - 1] == i) res = Math.max(res, i + 1);
            }
        }
        return res;
    }
}
