import java.util.Scanner;

public class UocLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int k = 0; k < T; k++) {
            long n = sc.nextLong();
            long max = findLargeOddDivisor(n);

            System.out.println(max);
        }
        sc.close();
    }

    private static long findLargeOddDivisor(long n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n;
    }
}
