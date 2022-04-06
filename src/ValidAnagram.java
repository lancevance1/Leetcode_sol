public class ValidAnagram {
    // tc:o(n+m),sc:o(1)
    public boolean isAnagram(String s, String t) {
        int[] m = new int[26];
        boolean res = true;
        if(s.length()!=t.length())return false;
        for(char c:t.toCharArray()){
            m[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(m[c-'a']==0)return false;
            m[c-'a']--;
        }
        return res;
    }

    // tc: o(mn),sc:o(1)
    // public boolean isAnagram(String s, String t) {
    //     int[] m = new int[26];
    //     boolean res = true;
    //     if(s.length()!=t.length())return false;
    //     for(char c:s.toCharArray()){
    //         int preIndex = m[c-'a'];
    //         int index = t.indexOf(c,preIndex);
    //         if(index==-1)return false;
    //         m[c-'a']=index+1;
    //     }
    //     return res;
    // }

//     public boolean isAnagram(String s, String t) {
//     if (s.length() != t.length()) {
//         return false;
//     }
//     int[] counter = new int[26];
//     for (int i = 0; i < s.length(); i++) {
//         counter[s.charAt(i) - 'a']++;
//         counter[t.charAt(i) - 'a']--;
//     }
//     for (int count : counter) {
//         if (count != 0) {
//             return false;
//         }
//     }
//     return true;
// }
}
