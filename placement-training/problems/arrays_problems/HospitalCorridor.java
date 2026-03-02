import java.util.*;

public class HospitalCorridor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            if (canReach(arr, N)) {
                System.out.println("Reachable");
            } else {
                System.out.println("Not Reachable");
            }
        }
        input.close();
    }

    static boolean canReach(int[] arr, int N) {
        if (N == 1) return true;

        int farthest = 0;
        for (int i = 0; i < N; i++) {
            if (i > farthest) {
                return false;
            }
            farthest = Math.max(farthest, i + arr[i]);
            if (farthest >= N - 1) {
                return true;
            }
        }
        return false;
    }
}
