import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                result += num;
            }
        }
        System.out.println(result);
    }
}