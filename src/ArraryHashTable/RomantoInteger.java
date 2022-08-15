package ArraryHashTable;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public int romanToInt(String s) {
        int res = 0;
        int len = s.length();
        char[] arr = s.toCharArray();
        Map<Character, Integer> m = new HashMap();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        if (len == 1) {
            return m.get(arr[0]);
        }
        int i = 0, j = 1;
        while (j < len) {
            int val = m.get(arr[i]);
            int val2 = m.get(arr[j]);
            if (val2 > val) {
                res -= val;
                res += val2;
                i += 2;
                j += 2;
            } else {
                res += val;
                i++;
                j++;
            }
        }
        if (i < len) {
            res += m.get(arr[i]);
        }
        return res;
    }
}
