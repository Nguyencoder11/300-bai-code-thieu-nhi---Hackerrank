import java.util.Scanner;

public class TongLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = tingTongLapPhuong(n);
        System.out.println(result);
        sc.close();
    }

    private static long tingTongLapPhuong(long n) {
        long MOD = 1000000007; // 10^9+7
        // Ta co 1^3+2^3+...+n^3 = (n*(n+1)/2)^2 = n^2*(n+1)^2/4
        long sum = 0;
        sum = (sum + (n * (n + 1) / 2) * (n * (n + 1) / 2)) % MOD;
        return sum;
    }
}
