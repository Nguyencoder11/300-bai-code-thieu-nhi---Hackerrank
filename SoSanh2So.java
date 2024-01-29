import java.math.BigInteger;
import java.util.Scanner;

public class SoSanh2So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        int result = a.compareTo(b);
        if (result == 0)
            System.out.println("=");
        else if (result > 0) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }
        sc.close();
    }
}
