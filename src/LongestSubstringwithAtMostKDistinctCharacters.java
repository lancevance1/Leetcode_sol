/**
 * 340. Longest Substring with At Most K Distinct Characters
 * Given a string s and an integer k, return the length of the longest substring of s that contains at most k distinct characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "eceba", k = 2
 * Output: 3
 * Explanation: The substring is "ece" with length 3.
 * Example 2:
 *
 * Input: s = "aa", k = 1
 * Output: 2
 * Explanation: The substring is "aa" with length 2.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * 0 <= k <= 50
 */


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
            int ans = 0, i = 0, j = 0, counter = 0;
            Map<Character, Integer> map = new HashMap<>();
            while(j < s.length()){
                if(!map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),1);
                    counter++;
                }else{
                    map.put(s.charAt(j), map.get(s.charAt(j))+1);
                }
                while(counter > k){
                    int temp = map.get(s.charAt(i));
                    temp--;
                    map.put(s.charAt(i),temp);
                    if(temp == 0){
                        map.remove(s.charAt(i));
                        counter--;
                    }
                    i++;
                }
                ans = Math.max(ans, j-i+1);
                j++;
            }
        return ans;
    }
}
