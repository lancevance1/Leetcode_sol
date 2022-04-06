public class RansomNote {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         boolean res = true;
//         char[] s1 = ransomNote.toCharArray();
//         char[] s2 = magazine.toCharArray();
//         Map<Character, Integer> m = new HashMap();
//         int len = s2.length;
//         for(int i=0; i<len;i++){

//              m.put(s2[i],m.getOrDefault(s2[i],0)+1);
//         }
//         for(int i=0; i<s1.length;i++){
//             if(!m.containsKey(s1[i])||m.get(s1[i])==0){
//                 return false;
//             }
//             m.put(s1[i],m.get(s1[i])-1);
//         }


//         return res;
//     }
//         public boolean canConstruct(String ransomNote, String magazine) {
//         int[] alphabets_counter = new int[26];

//         for (char c : magazine.toCharArray())
//             alphabets_counter[c-'a']++;

    //         for (char c : ransomNote.toCharArray()){
//             if (alphabets_counter[c-'a'] == 0) return false;
//             alphabets_counter[c-'a']--;
//         }
//         return true;
//     }
    //tc:o(mn), sc:o(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char ransomNoteChar : ransomNote.toCharArray()) {
            int num = ransomNoteChar - 'a';
            int preIndex = count[num];
            // handle duplicates
            int index = magazine.indexOf(ransomNoteChar, preIndex);
            if (index == -1) {
                return false;
            }
            count[num] = index + 1;
        }
        return true;
    }
}
