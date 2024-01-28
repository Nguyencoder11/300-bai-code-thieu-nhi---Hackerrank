import java.util.Scanner;

public class DemSoCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[i] * a[i] + a[j] == x) {
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
