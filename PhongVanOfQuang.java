import java.util.Scanner;

public class PhongVanOfQuang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0) {
            System.out.println("1");
        }
        if (n == 1) {
            System.out.println("5");
        }
        if (n > 1) {
            System.out.println("25");
        }
        sc.close();
    }
}
