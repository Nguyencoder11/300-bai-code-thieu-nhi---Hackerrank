import java.util.Scanner;

public class SoFibonacci {
    private static final long MOD_NUM = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result = fibonacci(n);
        System.out.println(result);
        scanner.close();
    }

    private static long fibonacci(long n) {
        if (n <= 0)
            return -1;
        if (n == 1 || n == 2)
            return 1;

        long[][] baseMatrix = { { 1, 1 }, { 1, 0 } };
        long[][] resultMatrix = matrixPower(baseMatrix, n - 2);

        return (resultMatrix[0][0] + resultMatrix[0][1]) % MOD_NUM;
    }

    private static long[][] matrixPower(long[][] base, long exp) {
        if (exp == 1)
            return base;

        long[][] result = matrixPower(base, exp / 2);
        result = matrixMultiply(result, result);

        if (exp % 2 == 1)
            result = matrixMultiply(result, base);

        return result;
    }

    private static long[][] matrixMultiply(long[][] A, long[][] B) {
        int rowA = A.length;
        int colA = A[0].length;
        int colB = B[0].length;
        long[][] C = new long[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    C[i][j] = (C[i][j] + (A[i][k] * B[k][j]) % MOD_NUM) % MOD_NUM;
                }
            }
        }

        return C;
    }
}
