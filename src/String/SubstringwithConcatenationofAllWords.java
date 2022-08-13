package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringwithConcatenationofAllWords {
    //tc:O(s.length*words.length)
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList();
        Map<String, Integer> m1 = new HashMap();

        for (var c : words) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        int wlen = words[0].length();
        int len = s.length();
        //i < len - words.length * wlen + 1; 这个是不tle的关键
        for (int i = 0; i < len - words.length * wlen + 1; i++) {
            Map<String, Integer> m2 = new HashMap();
            int j = 0;
            for (; j < words.length; j++) {
                if (i + wlen - 1 + j * wlen < len) {
                    String tmp = s.substring(i + j * wlen, i + wlen + j * wlen);
                    if (m1.containsKey(tmp)) {
                        int val = m1.get(tmp);
                        m2.put(tmp, m2.getOrDefault(tmp, 0) + 1);
                        int val2 = m2.get(tmp);
                        if (val < val2) {
                            break;
                        }
                    } else {
                        break;
                    }
                }

            }
            if (m1.equals(m2)) {
                res.add(i);
            }
        }
        return res;
    }
}

