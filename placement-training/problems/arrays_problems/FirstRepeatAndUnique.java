import java.util.*;
class FirstRepeatAndUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = input.nextInt();

            int firstRepeat = -1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (a[i] == a[j]) {
                        firstRepeat = a[i];
                        i = n;
                        break;
                    }
                }
            }

            int firstUnique = -1;
            for (int i = 0; i < n; i++) {
                boolean unique = true;
                for (int j = 0; j < n; j++) {
                    if (i != j && a[i] == a[j]) {
                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    firstUnique = a[i];
                    break;
                }
            }

            System.out.println("First Alert: " + firstRepeat);
            System.out.println("First Safe: " + firstUnique);
            System.out.println();
        }
    }
}
