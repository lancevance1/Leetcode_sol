package StringAlg;

public class MaximumDeletionsonaString {
    public int deleteString(String S) {
        var s = S.toCharArray();
        var n = s.length;
        var lcp = new int[n + 1][n + 1]; // lcp[i][j] 表示 s[i:] 和 s[j:] 的最长公共前缀
        for (var i = n - 1; i >= 0; --i)
            for (var j = n - 1; j >= 0; --j)
                if (s[i] == s[j])
                    lcp[i][j] = lcp[i + 1][j + 1] + 1;
        var f = new int[n];
        for (var i = n - 1; i >= 0; --i) {
            for (var j = 1; i + j * 2 <= n; ++j)
                if (lcp[i][i + j] >= j) // 说明 s[i:i+j] == s[i+j:i+j*2]
                    f[i] = Math.max(f[i], f[i + j]);
            ++f[i];
        }
        return f[0];
    }
}
