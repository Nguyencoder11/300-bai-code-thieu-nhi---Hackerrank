import java.util.Scanner;

public class DemSo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lay du lieu
        long a = sc.nextLong();
        long b = sc.nextLong();
        int count = countNumberWithoutSameDigits(a, b);
        System.out.println(count);
        sc.close();
    }

    // ham dem so luong cac so ma khong co cac chu so giong nhau
    private static int countNumberWithoutSameDigits(long a, long b) {
        int count = 0;
        for (long i = a; i <= b; i++) {
            // Neu so co cac chu so giong nhau thi bo qua
            if (sameDigits(i)) {
                continue;
            }
            count++;
        }
        return count;
    }

    private static boolean sameDigits(long num) {
        // Chuyen so ve dang chuoi
        String strNum = Long.toString(num);
        for (int i = 0; i < strNum.length() - 1; i++) {
            if (strNum.charAt(i) == strNum.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
