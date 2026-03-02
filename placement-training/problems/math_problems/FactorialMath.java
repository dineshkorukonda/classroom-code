public class FactorialMath {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++)
            System.out.println(i + "! = " + factorial(i));
    }
}
