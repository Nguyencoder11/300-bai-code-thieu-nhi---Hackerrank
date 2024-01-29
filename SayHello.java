import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        String result = checkMessage(message);
        System.out.println(result);
        sc.close();
    }

    private static String checkMessage(String message) {
        String targetMessage = "hello";
        int targetIndex = 0;
        for (int i = 0; i < message.length(); i++) {
            if (targetMessage.charAt(targetIndex) == message.charAt(i)) {
                targetIndex++;
            }
            if (targetIndex == targetMessage.length()) {
                return "YES";
            }
        }
        return "NO";
    }
}
