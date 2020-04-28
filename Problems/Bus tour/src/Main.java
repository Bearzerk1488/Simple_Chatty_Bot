import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int countOfBridges = scanner.nextInt();
        int count = 1;
        for (int i = 0; i < countOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + count);
                break;
            }
            count++;
        }
        if (countOfBridges == count - 1) {
            System.out.println("Will not crash");
        }
    }
}