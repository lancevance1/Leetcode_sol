public class FindtheDifference {
    //     public char findTheDifference(String s, String t) {
//         char res = 0;
//         Map<Character,Integer> e=new HashMap();
//         for(char c : s.toCharArray()){
//             e.put(c,e.getOrDefault(c,0)+1);
//         }
//         for(char c : t.toCharArray()){

//             if(!e.containsKey(c)){
//                 return c;
//             }else{
//                 int tmp = e.get(c);
//                 if(tmp==0)return c;
//                 e.put(c,tmp-1);
//             }
//         }
//         return res;
//     }

    public char findTheDifference(String s, String t) {
        char res = 0;
        int[]map=new int[26];
        for(char c : s.toCharArray()){
            map[c-'a']++;
        }
        for(char c : t.toCharArray()){
            if(map[c-'a']==0){
                return c;
            }else{
                map[c-'a']--;
            }
        }
        return res;
    }
//         public char findTheDifference(String s, String t) {

//         final int len = s.length();
//         char addedLetter = t.charAt(len);

//         final char[] firstStringChar = s.toCharArray();
//         final char[] secondStringChar = t.toCharArray();

//         for(int i = 0 ; i < len ; i++)
//             addedLetter ^= firstStringChar[i] ^ secondStringChar[i];

//         return addedLetter;
//     }

}
