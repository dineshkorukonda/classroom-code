import java.util.*;

public class SteppingStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int N = input.nextInt();
            int[] stones = new int[N];

            for (int i = 0; i < N; i++) {
                stones[i] = input.nextInt();
            }

            System.out.println(minJumps(stones, N));
        }
        input.close();
    }

    static int minJumps(int[] stones, int N) {
        if (N == 1) return 0;
        if (stones[0] == 0) return -1;

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < N - 1; i++) {
            farthest = Math.max(farthest, i + stones[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= N - 1) {
                    return jumps;
                }

                if (currentEnd <= i) {
                    return -1;
                }
            }
        }
        return -1;
    }
}
