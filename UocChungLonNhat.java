import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Kiem tra xem co ton tai day b thoa man dieu kien a[i] = gcd(b[i], b[i+1])
            boolean existedValue = existedValueFunction(a, n);
            if (existedValue) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean existedValueFunction(int[] a, int n) {
        // Neu mang a chi co 1 ptu
        if (n == 1)
            return true;
        // Kiem tra cac cap phan tu lien tiep trong a
        for (int i = 0; i < n - 1; i++) {
            if (gcd(a[i], a[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
