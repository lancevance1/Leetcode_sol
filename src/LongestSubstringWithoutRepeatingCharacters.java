import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */


public  class LongestSubstringWithoutRepeatingCharacters {
    //soln 1
//        public static int lengthOfLongestSubstring(String s) {
//            int n = s.length();
//            Set<Character> set = new HashSet<>();
//            int ans = 0, i = 0, j = 0;
//            while (i < n && j < n) {
//                // try to extend the range [i, j]
//                if (!set.contains(s.charAt(j))){
//                    set.add(s.charAt(j));
//                    j++;
//                    ans = Math.max(ans, j - i);
//
//                }
//                else {
//                    set.remove(s.charAt(i));
//                    i++;
//
//                }
//            }
//            return ans;
//        }
    //soln 2
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),1);
                ans = Math.max(ans, j - i+1);
                j++;
            }
            else {
                map.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
