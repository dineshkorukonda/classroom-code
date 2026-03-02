import java.util.*;

public class TwoSumHashing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while (T-- > 0) {
            int N = input.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = input.nextInt();
            }

            int S = input.nextInt();
            HashSet<Integer> seen = new HashSet<>();
            boolean found = false;

            for (int i = 0; i < N; i++) {
                int need = S - arr[i];
                if (seen.contains(need)) {
                    System.out.println(need + " " + arr[i]);
                    found = true;
                    break;
                }
                seen.add(arr[i]);
            }

            if (!found) {
                System.out.println("No Match");
            }
        }
        input.close();
    }
}
