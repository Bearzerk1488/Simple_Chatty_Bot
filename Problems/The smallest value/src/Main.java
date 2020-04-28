import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        int count = 1;
        while (n <= m) {
            n *= count + 1;
            count++;
        }
        System.out.println(count);
    }
}