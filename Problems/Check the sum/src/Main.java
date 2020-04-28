import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean s1 = a + b == 20;
        boolean s2 = a + c == 20;
        boolean s3 = c + b == 20;
        System.out.println(s1 || s2 || s3);
    }
}