package ArraryHashTable;

import java.util.*;

public class GroupAnagrams {
    //tc: O(mn) where m is the max length of string, sc:O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        Map<String, Integer> m = new HashMap();

        for (var string : strs) {
            var s = helper(string);
            if (m.containsKey(s)) {
                res.get(m.get(s)).add(string);
            } else {
                List<String> l = new ArrayList();
                l.add(string);
                res.add(l);
                m.put(s, res.size() - 1);
            }
        }
        return res;
    }

    private String helper(String s) {
        int[] map = new int[26];
        for (var c : s.toCharArray()) {
            map[c - 'a']++;
        }
        return Arrays.toString(map);
    }
//    private String helper(String s) {
//        int[] map = new int[26];
//        for (var c : s.toCharArray()) {
//            map[c - 'a']++;
//        }
//        StringJoiner sb = new StringJoiner(",");
//        for (var c : map) {
//            sb.add(String.valueOf(c));
//        }
//        return sb.toString();
//    }
}
