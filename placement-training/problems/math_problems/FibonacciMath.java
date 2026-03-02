public class FibonacciMath {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int t = a + b;
            a = b;
            b = t;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printFibonacci(20);
    }
}
