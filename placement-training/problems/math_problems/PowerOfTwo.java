public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 8, 16, 18, 32, 64, 100, 128};
        for (int n : nums)
            System.out.println(n + " is power of 2: " + isPowerOfTwo(n));
    }
}
