package ArraryHashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    //hashset
    //tc:o(n*s) where n is the length of words, s is the longest string of words[i]; sc:o(n*s)
    public int uniqueMorseRepresentations(String[] words) {
        String[] alphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> s = new HashSet<>();
        for (var w : words) {
            StringBuilder tmp = new StringBuilder();
            for (var c : w.toCharArray()) {
                tmp.append(alphabet[c - 'a']);
            }
            s.add(tmp.toString());
        }
        return s.size();
    }

    //hashmap
//    public int uniqueMorseRepresentations(String[] words) {
//        String[] alphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//        Map<String, Integer> m = new HashMap();
//        for (var w : words) {
//            String tmp = "";
//            for (var c : w.toCharArray()) {
//                tmp += alphabet[c - 'a'];
//            }
//            m.put(tmp, m.getOrDefault(tmp, 0) + 1);
//        }
//        return m.size();
//    }
}
