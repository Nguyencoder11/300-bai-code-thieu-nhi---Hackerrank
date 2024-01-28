import java.util.Scanner;

public class HieuChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long oddSum = 0, evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Cong cac phan tu o vi tri le
                oddSum += a[i];
            } else {
                // Cong cac phan tu o vi tri chan
                evenSum += a[i];
            }
        }
        System.out.println(evenSum - oddSum);
        sc.close();
    }
}
