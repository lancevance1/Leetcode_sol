package StringAlg;

import java.util.HashSet;
import java.util.Set;

public class CheckifOneStringSwapCanMakeStringsEqual {
    //tc:o(n);sc:o(n)
//    public boolean areAlmostEqual(String s1, String s2) {
//        Set<Character> set = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();
//        var nums1 = s1.toCharArray();
//        var nums2 = s2.toCharArray();
//        int count = 0;
//        for (var c : nums1) {
//            set2.add(c);
//        }
//        for (var c : nums2) {
//            if (!set2.contains(c)) {
//                return false;
//            }
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums1[i] != nums2[i]) {
//                set.add(nums1[i]);
//                set.add(nums2[i]);
//                count++;
//            }
//        }
//        return (count == 0 && set.size() == 0) || (count == 2 && set.size() == 2);
//    }
    public boolean areAlmostEqual(String s1, String s2) {
        var oldCharArray = s1.toCharArray();
        var newCharArray = s2.toCharArray();
        int count = 0;
        char oldChar1 = 0, newChar1 = 0, oldChar2 = 0, newChar2 = 0;
        for (int i = 0; i < oldCharArray.length; i++) {
            if (count > 2) return false;
            if (oldCharArray[i] != newCharArray[i]) {
                count++;
                if (count == 2) {
                    oldChar2 = oldCharArray[i];
                    newChar2 = newCharArray[i];
                } else if (count == 1) {
                    oldChar1 = oldCharArray[i];
                    newChar1 = newCharArray[i];
                }
            }
        }
        if (count == 2) {
            return oldChar2 == newChar1 && newChar2 == oldChar1;
        }
        if (count == 0) return true;
        return false;
    }
}
