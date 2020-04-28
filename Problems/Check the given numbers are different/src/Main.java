import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean compare1 = a != b && b != c;
        boolean compare2 = b != a && b != c;
        boolean compare3 = c != a && c != b;
        System.out.println(compare1 && compare2 && compare3);
    }
}