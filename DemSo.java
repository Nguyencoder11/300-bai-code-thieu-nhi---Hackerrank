import java.util.Scanner;

public class DemSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        for (long x = a; x <= b; x++) {
            if (x % c != 0 && x % d != 0) {
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
