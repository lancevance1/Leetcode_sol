package StringAlg;

public class ImplementstrStr {
    //kmp
//    public int strStr(String haystack, String needle) {
//        int ans = -1,j=0;
//        int n=haystack.length(), m=needle.length();
//        if (m==0)return 0;
//        int[] arr = failureFunction(needle);
//        for (int i = 0; i <n; i++) {
//            while(haystack.charAt(i)!=needle.charAt(j)){
//                if (j==0)break;
//                j=arr[j-1];
//            }
//            if (haystack.charAt(i)==needle.charAt(j)){
//                j++;
//            }
//            if (j==m)return i-j+1;
//
//        }
//
//        return ans;
//    }
//    public int[] failureFunction(String s){
//        int n = s.length(), j=0;
//        int[] arr = new int[n];
//
//        for (int i = 1; i < n; i++) {
//            while(s.charAt(i)!=s.charAt(j)){
//                if (j==0){
//                    break;
//                }
//                j=arr[j-1];
//            }
//            if (s.charAt(i)==s.charAt(j)){
//
//
//                j++;
//                arr[i]=j;
//            }
//        }
//        return arr;
//
//
//    }


    public int strStr(String haystack, String needle) {
        int ans = -1;
        if (needle.length() == 0) return 0;


        // Create concatenated string "P$T"
        String concat = needle + "$" + haystack;

        int l = concat.length();

        int z[] = new int[l];

        // Construct Z array
        z = zArray(concat);

        // now looping through Z array for matching condition
        for (int i = 0; i < l; ++i) {

            // if Z[i] (matched region) is equal to pattern
            // length we got the pattern

            if (z[i] == needle.length()) {
                ans = i - needle.length() - 1;
                return ans;
            }
        }

        return ans;
    }

    public int[] zArray(String s) {
        int n = s.length();
        int[] arr = new int[n];
        int x = 0, y = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = Math.max(0, Math.min(arr[i - x], y - i + 1));
            while (i + arr[i] < n && s.charAt(arr[i]) == s.charAt(i + arr[i])) {
                x = i;
                y = i + arr[i];
                arr[i]++;
            }
        }
        return arr;
    }
}
