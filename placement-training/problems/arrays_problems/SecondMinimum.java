import java.util.*;
class SecondMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = input.nextInt();
            int min = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] < min) {
                    second = min;
                    min = a[i];
                } else if (a[i] > min && a[i] < second) {
                    second = a[i];
                }
            }
            if (second == Integer.MAX_VALUE) System.out.println("Not Eligible");
            else System.out.println(second);
        }
    }
}
