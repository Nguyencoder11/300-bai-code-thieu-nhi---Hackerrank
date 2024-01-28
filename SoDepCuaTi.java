import java.util.Scanner;

public class SoDepCuaTi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = scan.nextInt();
        }

        System.out.println(soNguyenDuongDepMin(a, b));
        scan.close();
    }

    public static int soNguyenDuongDepMin(int[] a, int[] b) {
        for (int i = 1; i <= 100; i++) {
            boolean fromListA = false;
            boolean fromListB = false;

            int num = i;
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                for (int j = 0; j < a.length; j++) {
                    if (digit == a[j]) {
                        fromListA = true;
                        break;
                    }
                }
                for (int k = 0; k < b.length; k++) {
                    if (digit == b[k]) {
                        fromListB = true;
                        break;
                    }
                }
            }
            if (fromListA && fromListB) {
                return i;
            }
        }
        return -1;
    }
}
