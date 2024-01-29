import java.util.Scanner;

public class NguyenToCoDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = countPrime(n);
        System.out.println(count);
        sc.close();
    }

    public static int countPrime(int n) {
        if (n <= 1)
            return 0;

        // Su dung phuong phap sang nguyen to Eratosthenes
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = p * p; i < n; i += p) {
                    primes[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
}
