import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuangBietUoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        long result = findKthDivisor(n, k);
        System.out.println(result);
        scanner.close();
    }

    public static long findKthDivisor(long n, long k) {
        ArrayList<Long> divisors = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        if (k <= divisors.size()) {
            return divisors.get((int) (k - 1));
        } else {
            return -1;
        }
    }
}
