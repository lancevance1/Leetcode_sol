public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int min = 201;
        for (int i = 0; i < strs.length; i++) {
            min = Math.min(min, strs[i].length());
        }
        for (int j = 0; j < min; j++) {
            char tmp = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if(tmp!=strs[i].charAt(j)){
                    return strs[0].substring(0,j);
                }
            }
        }
        return strs[0].substring(0,min);
    }
}
