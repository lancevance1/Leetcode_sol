package Math;

public class MirrorReflection {
    //tc:o(log(min(p,q)));sc:o(1)
    public int mirrorReflection(int p, int q) {
        var tmp = LCM(p, q);
        var t = p;
        p = tmp / q;
        q = tmp / t;
        if (p % 2 == 0 && q % 2 != 0) return 2;
        if (p % 2 != 0 && q % 2 == 0) return 0;
        if (p % 2 != 0 && q % 2 != 0) return 1;
        return -1;
    }

    private int GCD(int a, int b) {
        return a % b == 0 ? b : GCD(b, a % b);
    }
    private int gcd(int p,int q) {
        while(q>0) {
            int next = p % q;
            p = q;
            q = next;
        }
        return p;
    }

    private int LCM(int a, int b) {
        return a * b / gcd(a, b);
    }
}
