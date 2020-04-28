import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > result && a % 4 == 0) {
                result = a;
            }
        }
        System.out.println(result);
    }
}