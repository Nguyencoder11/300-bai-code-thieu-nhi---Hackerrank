import java.util.Scanner;

public class TinhLuyThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int giaithua = 1;
        for (int i = 1; i <= b; i++) {
            giaithua *= a;
        }
        System.out.println(giaithua);

        sc.close();
    }
}
