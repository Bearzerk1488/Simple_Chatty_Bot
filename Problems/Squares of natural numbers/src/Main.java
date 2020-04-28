import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = 1;
        int count = 2;
        do {
            System.out.println(n);
            n = count * count;
            count++;
        } while (n <= m);
    }
}