import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            int write = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] != 0) {
                    arr[write++] = arr[i];
                }
            }

            while (write < N) {
                arr[write++] = 0;
            }

            for (int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
