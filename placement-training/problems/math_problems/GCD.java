public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int[][] pairs = {{12, 18}, {21, 14}, {100, 25}, {17, 13}};
        for (int[] p : pairs)
            System.out.println("GCD(" + p[0] + ", " + p[1] + ") = " + gcd(p[0], p[1]) +
                               ", LCM = " + lcm(p[0], p[1]));
    }
}
