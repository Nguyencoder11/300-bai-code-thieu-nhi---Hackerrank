import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuyThua2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> result = tongSoLuyThua(n, k);
        if (result == null) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int power : result) {
                System.out.print(power + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static List<Integer> tongSoLuyThua(int n, int k) {
        List<Integer> powers = new ArrayList<>(); // Danh sach luu tru cac luy thua cua 2 ma nho hon n
        List<Integer> result = new ArrayList<>(); // Danh sach ket qua

        int power = -1;
        while (Math.pow(2, power) <= n) {
            powers.add((int) Math.pow(2, power));
            power++;
        }

        int i = powers.size() - 1;
        while (n > 0 && k > 0 && i >= 0) {
            int currentPower = powers.get(i);
            if (currentPower <= n) {
                result.add(currentPower);
                n -= currentPower;
                k--;
            }
            i--;
        }

        if (n > 0 || k > 0) {
            return null;
        } else {
            return result;
        }
    }
}
