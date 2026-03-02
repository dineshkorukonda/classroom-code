import java.util.*;
class RotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = input.nextInt();

            k = k % n;
            int[] res = new int[n];
            int idx = 0;

            for (int i = n - k; i < n; i++) res[idx++] = a[i];
            for (int i = 0; i < n - k; i++) res[idx++] = a[i];

            for (int i = 0; i < n; i++) System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}
