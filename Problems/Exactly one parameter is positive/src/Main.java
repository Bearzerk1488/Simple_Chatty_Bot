import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        boolean m1 = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean m2 = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean m3 = n1 <= 0 && n2 <= 0 && n3 > 0;
        System.out.println(m1 || m2 || m3);
    }
}