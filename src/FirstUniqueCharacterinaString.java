public class FirstUniqueCharacterinaString {
    //tc: o(n),sc:o(1)
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> m = new HashMap();
//         int res = -1;
//         for(int i=0;i<s.length();i++){
//             if(m.containsKey(s.charAt(i))){
//                  m.put(s.charAt(i),m.get(s.charAt(i))+1);
//             }else{
//                  m.put(s.charAt(i),1);
//             }

//         }
//         for(int i=0;i<s.length();i++){
//             if(m.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return res;
//     }
    //tc: o(n),sc:o(1)
//     public int firstUniqChar(String s) {
//         int[] count = new int[26];
//         int n = s.length();
//         // build char count bucket : <charIndex, count>
//         for (int i = 0; i < n; i++) {
//             int index = s.charAt(i) - 'a';
//             count[index]++;
//         }

//         // find the index
//         for (int i = 0; i < n; i++) {
//             int index = s.charAt(i) - 'a';
//             if (count[index] == 1) {
//                 return i;
//             }

//         }
//         return -1;
//     }



    // using built-in indexOf() and lastIndexOf()
    //tc: o(n),sc:o(1)
    public int firstUniqChar(String s) {
        int res = s.length();
        for(char c='a';c<='z';c++){
            //worst case tc: o(n)
            int i = s.indexOf(c);
            if(i!=-1&&i==s.lastIndexOf(c)){
                res=Math.min(res,i);
            }
        }
        if(res== s.length())return -1;
        return res;
    }

}
