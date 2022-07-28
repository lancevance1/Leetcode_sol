package Math;

public class SqrtJava {
    // Java Math.sqrt() source code
    public static double sqrt(double x) {
        double TWO_54 = 0x40000000000000L; // Long bits 0x4350000000000000L.
        if (x < 0)
            return Double.NaN;
        if (x == 0 || !(x < Double.POSITIVE_INFINITY))
            return x;

        // Normalize x.
        long bits = Double.doubleToLongBits(x);
        int exp = (int) (bits >> 52);
        if (exp == 0) // Subnormal x.
        {
            x *= TWO_54;
            bits = Double.doubleToLongBits(x);
            exp = (int) (bits >> 52) - 54;
        }
        exp -= 1023; // Unbias exponent.
        bits = (bits & 0x000fffffffffffffL) | 0x0010000000000000L;
        if ((exp & 1) == 1) // Odd exp, double x to make it even.
            bits <<= 1;
        exp >>= 1;

        // Generate sqrt(x) bit by bit.
        bits <<= 1;
        long q = 0;
        long s = 0;
        long r = 0x0020000000000000L; // Move r right to left.
        while (r != 0) {
            long t = s + r;
            if (t <= bits) {
                s = t + r;
                bits -= t;

                q += r;
            }
            bits <<= 1;
            r >>= 1;
        }

        // Use floating add to round correctly.
        if (bits != 0)
            q += q & 1;
        return Double.longBitsToDouble((q >> 1) + ((exp + 1022L) << 52));
    }
}
