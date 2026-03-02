import java.util.*;

public class ProductExceptSelf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }

            long[] left = new long[n];
            long[] right = new long[n];
            long[] result = new long[n];

            left[0] = 1;
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * arr[i - 1];
            }

            right[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--) {
                right[i] = right[i + 1] * arr[i + 1];
            }

            for (int i = 0; i < n; i++) {
                result[i] = left[i] * right[i];
            }

            for (long val : result) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
