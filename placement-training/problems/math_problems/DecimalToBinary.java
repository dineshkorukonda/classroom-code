public class DecimalToBinary {

    static void decToBin(int n) {
        if (n == 0)
            return;

        decToBin(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 13;

        System.out.print("Binary: ");
        decToBin(n);
    }
}

