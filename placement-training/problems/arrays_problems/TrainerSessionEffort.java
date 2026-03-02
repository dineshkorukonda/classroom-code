import java.util.Scanner;

public class TrainerSessionEffort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            System.out.print("Enter number of sessions: ");
            int n = sc.nextInt();

            int[] effort = new int[n];


            System.out.println("Enter session efforts:");
            for (int i = 0; i < n; i++) {
                effort[i] = sc.nextInt();
            }

            System.out.print("Enter break index: ");
            int breakIndex = sc.nextInt();

            int result = rightSumAfterBreak(effort, breakIndex);

            System.out.println("Result for Test Case " + tc + ": " + result);
            System.out.println();
        }

        sc.close();
    }

    public static int rightSumAfterBreak(int[] effort, int breakIndex) {

        if (effort == null || effort.length == 0) return 0;
        if (breakIndex < 0 || breakIndex >= effort.length) return 0;

        int totalSum = 0;
        for (int x : effort) {
            totalSum += x;
            sum += x;
        }

        int leftSum = 0;
        for (int i = 0; i < breakIndex; i++) {
            leftSum += effort[i];
            sum += effort[i];
        }

        return totalSum - leftSum - effort[breakIndex];
    }
}
