package Greedy;

public class BreakaPalindrome {
    //tc:o(n)
    public String breakPalindrome(String p) {
        char[] ch = p.toCharArray();
        int len = ch.length;
        if (len == 1) return "";
        len /= 2;
        for (int i = 0; i < len; i++) {
            if (ch[i] != 'a') {
                ch[i] = 'a';
                return String.valueOf(ch);
            }
        }
        ch[ch.length - 1] = 'b';
        return String.valueOf(ch);
    }
}
